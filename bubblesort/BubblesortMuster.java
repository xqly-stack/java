package bubblesort;

import java.util.Scanner;

public class BubblesortMuster {

    Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {  
    // Deklaration der Variablen
    Scanner scan = new Scanner(System.in);
    double summe=0;
    double durchschnitt=0;
    double max=0;
    double min=0;
    String wahl;
    int zwischenspeicher;
    
    // Deklaration des Arrays / Definition/Eingabe der Länge
    System.out.println("Anzahl Elemente eingeben:\t");
    int anzahlElemente = scan.nextInt();
    int[] zahlen=new int[anzahlElemente];
          
    // Das Array wird gefühlt mit Zahlen des Users 
    zahlen = befuelleArray(zahlen);
    
    for (int i=0;i<zahlen.length;i++ ) {
      zahlen[i]=eingabe.getInt((i+1)+ ".Zahl eingeben:\t");
    } 
                
    // Addiert alle Zahlen im Array
    for (int i=0;i<zahlen.length;i++ ) {
      summe=summe +zahlen[i];
    } 
         
    // Sucht das Minimum und das Maximum im Array
    for (int i=0;i<zahlen.length;i++ ) {  
      if (i==0) {
        min= zahlen[i];
        max= zahlen[i];
      } 
      
      if (max<zahlen[i]) {
        max= zahlen[i];
      } 
      
      if (min > zahlen[i]) {
        min = zahlen[i];
      } 
    } 
    
    // Menüauswahl
    System.out.println("Sortierreihnfolge:\t");
    System.out.println("a-aufsteigend");
    System.out.println("b-absteigend");
    
    do {
      wahl = eingabe.getString("Ihre Wahl:\t");  
    } while (wahl.equals("a") && wahl.equals ("b")); 
    
    // Gibt das Array auf der Konsole aus
    for (int i=0;i<zahlen.length ;i++ ) {
      System.out.print(zahlen[i]+"\t");
    }  
    
    // Sortieren nach Bubblesort
    for (int i =0;i<zahlen.length ;i++ ) {
      for (int s=1;s<zahlen.length-i ;s++ ) {
        if (wahl.equals("a")) {
          if (zahlen[s]> zahlen[s-1]) {
            // tauscht zwei Zahlen im Array
            zwischenspeicher = zahlen[s-1];   
            zahlen[s-1]= zahlen[s];
            zahlen[s]= zwischenspeicher;
          } // end of if
        } else {
          if (wahl.equals("b")) {
            if (zahlen[s]< zahlen[s-1]) {
              // tauscht zwei Zahlen im Array
              zwischenspeicher =zahlen[s-1];
              zahlen[s-1]= zahlen[s];
              zahlen[s]= zwischenspeicher;
            } // end of if
          } // end of if
        } // end of if-else    
      } // end of for    
    } // end of for
    
    // Gibt das Array auf der Konsole aus
    for (int i=0;i<zahlen.length ;i++ ) {
      System.out.print(zahlen[i] + "\t");
    } 
    
    // Geb alle Ergebnisse aus  
    durchschnitt= summe/zahlen.length;
    System.out.println("Die Summe :\t"+summe);
    System.out.println("Der Durchschnitt :\t"+durchschnitt);
    System.out.println(" Die Maximale wert:\t"+max);
    System.out.println("Die Minimale Wert:\t"+min);
    
  }

  public static int[] befuelleArray(int[] zahlen) {
    
    for (int i=0;i<zahlen.length;i++ ) {
      zahlen[i]=scan.nextInt((i+1)+ ".Zahl eingeben:\t");
    
    return zahlen;
  }

}