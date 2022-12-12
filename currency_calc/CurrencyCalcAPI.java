package currency_calc;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Writer;
import java.net.URL;
import java.util.Scanner;

import javax.net.ssl.HttpsURLConnection;
import javax.print.event.PrintEvent;

@SuppressWarnings({"unused"})
public class CurrencyCalcAPI {

    private String api = "";
    private String currencyCONV;
    private String content;
    private String filename;   
    private String xmlpath;

    public CurrencyCalcAPI(String api, String currencyCONV, String xmlpath) throws IOException {

        this.currencyCONV = currencyCONV;
        this.api = api;
        this.xmlpath = xmlpath;

        // Setting everything up for the connection
        URL url = new URL(api);
        HttpsURLConnection con = (HttpsURLConnection) url.openConnection();
        con.setRequestMethod("GET");
        con.setRequestProperty("Content-Type", "application/json");
        String contentType = con.getHeaderField("Content-Type");

        // Reading from connection
        BufferedReader in = new BufferedReader(
        new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuffer content = new StringBuffer();
        while ((inputLine = in.readLine()) != null) {
            content.append(inputLine);
        }
        in.close();

        // content
        this.content = content.toString();
        // Parsing json 

    }

    public String getResponseBody() {

        return this.content;
    }

    public void createJSONFile(String file) throws IOException {

        String filename = file; 
        this.filename = filename;
        Writer wr = new FileWriter(filename);
        wr.write(this.content);
        wr.flush();
        wr.close();

    }


    public String getResults() throws FileNotFoundException{

        File xmldata = new File(this.xmlpath);
        Scanner read = new Scanner(xmldata);
        int ln = 1;
        StringBuffer data = new StringBuffer();
        while (read.hasNextLine()) {
            String line = read.nextLine();
            System.out.println(line);
            ln+=1;
            data.append(line);
        }
        read.close();
        return (data.toString());
    }






}