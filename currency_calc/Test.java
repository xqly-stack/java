package currency_calc;

import java.io.IOException;
import java.util.Scanner;

import javax.print.event.PrintEvent;

@SuppressWarnings({"unused"})
public class Test {

    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) throws Exception{

        String url = "https://cdn.jsdelivr.net/gh/fawazahmed0/currency-api@1/latest/currencies/eur.json";
        String currencyCONV = "";
        System.out.printf("Currency to convert to [FROM EUR]:\n");
        
        do {
            System.out.println("");
            currencyCONV = scan.next();
        } while (!(currencyCONV.equalsIgnoreCase("USD") | currencyCONV.equalsIgnoreCase("gbp")));

        CurrencyCalcAPI apiInstance = (CurrencyCalcAPI) new CurrencyCalcAPI(url, currencyCONV, "currency_calc/output/data.xml");
        //String respBody = apiInstance.getResponseBody();

        //apiInstance.createJSONFile("/output/output.json");
        //System.out.println(respBody); 
        String xml_data = apiInstance.getResults();
        System.out.println(xml_data);
    }

    public String XMLParser(String xml_data, String currency) {

        

        return xml_data;
    }
}
