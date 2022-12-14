package bubblesort;
import java.util.Scanner;

public class Bubblesort {

    public static void main( String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.printf("\nAnzahl eingeben:\t");
        int anzahl = scan.nextInt();
        int[] zahlen = new int[anzahl];

        // Array wird mit Zahlen gefüllt
        for (int i = 0; i < zahlen.length; i++) {
            System.out.printf("%s. Zahl:\t", (i+1));
            int zahl = scan.nextInt();
            zahlen[i] = zahl;
        }

        // Auswahl der Sortierreihenfolge
        System.out.printf("\nSortierreihenfolge");
        System.out.printf("\na - aufsteigend(ASC)\nb - absteigend(DESC)\n");
        System.out.printf("\nIhre Wahl:\t");
        String sort = scan.next();
        System.out.println("-------------------");
        scan.close();
        int[] erg = new int[4];
        int passes = (zahlen.length * zahlen.length)*zahlen.length;
        int j = 0;
        int sum = 0;
        // Aufsteigend - a (ASC)
        if (sort.equalsIgnoreCase("a")) {
                
            for (int i = 0; i < zahlen.length; i++) {
                sum+=1;
                // Index out of bound error vermeiden!
                if (i == (zahlen.length - 1)) {
                    j+=1;
                    //System.out.println(j);
                    i = 0;
                    if (j == passes) {
                        Output.output(sum);
                        break;                        
                    }

                }
                if (zahlen[(i+1)] < zahlen[i]) {

                    
                    int tmp1 = zahlen[i];
                    zahlen[i] = zahlen[(i+1)];
                    zahlen[(i+1)] = tmp1;
                }
            }
            arrAusgabe(zahlen);
            erg = kennzahlen(zahlen, "ASC");
            

        }

        // Absteigend - b (DESC)
        else if (sort.equalsIgnoreCase("b")) {
            
            
            for (int i = 0; i < zahlen.length; i++) {
                sum+=1;
                // Index out of bound error vermeiden!
                if (i == (zahlen.length - 1)) {
                    j+=1;
                    i = 0; 
                    if (j == passes) {
                        Output.output(sum);
                        break;                        
                    }

                }
                if (zahlen[(i+1)] > zahlen[i]) {


                    int tmp1 = zahlen[i];
                    int tmp2 = zahlen[(i+1)];
                    zahlen[i] = tmp2;
                    zahlen[(i+1)] = tmp1;
                }
            }
            arrAusgabe(zahlen); // Falsche Ausgabe
            erg = kennzahlen(zahlen, "DESC");

        }

        // Ergebnisse
        System.out.println("\n----------------------------------------------"); 
        System.out.printf("\nMaximum:%s\nMinimum:%s\nSumme:%s\nDurchschnitt:%s\n", erg[0], erg[1], erg[2], erg[3]);



    
    }

    public static void arrAusgabe(int[] arr) {

        int deli = 0;
        for (int i = 0; i < arr.length; i++) {
            deli+=1;
            System.out.printf("Zahl:%s ", arr[i]);
            if (deli == 4) {
                System.out.printf("\n");
                deli = 0;
            }
        }
        


    }

    public static int[] kennzahlen(int[] arr, String path) {

        int[] sum = new int[4];
        int durchschnitt = 0;
        int maximum = 0;
        int minimum = 0;
        int summe = 0;

        // Wenn ASC - aufsteigend - a
        if (path.equalsIgnoreCase("ASC")) {
            
            
            maximum = arr[(arr.length-1)];
            minimum= arr[0];
            
            
        }
        
        // Wenn DESC - absteigend - b
        if (path.equalsIgnoreCase("DESC")) {
            
            maximum = arr[0];
            minimum = arr[(arr.length-1)];
    
        }

        // Kennzahlen
        for (int i = 0; i < arr.length; i++) {
            
            summe += arr[i];

        }

        durchschnitt = summe / arr.length;
        sum[0] = maximum;
        sum[1] = minimum;
        sum[2] = summe;
        sum[3] = durchschnitt;



        return sum;
    }

}