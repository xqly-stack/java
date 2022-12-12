package bubblesort;

import java.util.Scanner;


public class BubblesortMuster {
    
  public static void main(String[] args) {  
    // Deklaration der Variablen
    double summe=0;
    double durchschnitt=0;
    double max=0;
    double min=0;
    String wahl;
    int zwischenspeicher;
    
    Scanner eingabe = new Scanner(System.in);
    // Deklaration des Arrays / Definition/Eingabe der L?ge
    System.out.printf("\nAnzahlElemente eingeben:\t");
    int anzahlElemente = eingabe.nextInt();
    int[] zahlen=new int[anzahlElemente];
    
    // Das Array wird gef?lt mit Zahlen des Users 
    zahlen = befuelleArray(zahlen);
    
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
    
    // Men?uswahl
    System.out.println("Sortierreihnfolge:\t");
    System.out.println("a-aufsteigend");
    System.out.println("b-absteigend");
    
    do {
      System.out.printf("\nIhre Wahl:\t");
      wahl = eingabe.nextLine();  
    } while (wahl.equals("a") && wahl.equals ("b")); 
    
    // Gibt das Array auf der Konsole aus
    for (int i=0;i<zahlen.length ;i++ ) {
      System.out.print(zahlen[i]+"\t");
    }  
   
    int sum = 0;
    // Sortieren nach Bubblesort
    for (int i =0;i<zahlen.length ;i++ ) {
      sum+=1;
      for (int s=1;s<zahlen.length-i ;s++ ) {
        sum+=1;
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
   
    System.out.println("\nSchleifendurchgänge: "+ sum);
    // Gibt das Array auf der Konsole aus
    for (int i=0;i<zahlen.length ;i++ ) {
      System.out.print(zahlen[i] + "\t");
    } 
    
    // Geb alle Ergebnisse aus  
    ausgabeAlles(summe, max, min, zahlen);
    eingabe.close();
  } 
  
  public static int[] befuelleArray(int[] zahlen) {
    Scanner eingabe = new Scanner(System.in);
    for (int i=0;i<zahlen.length;i++ ) {
        System.out.println((i+1) + ".Zahl eingeben:\t");      
      zahlen[i]=eingabe.nextInt();
    }
    eingabe.close();
    return zahlen;
  }
  
  public static void ausgabeAlles(double a, double b, double c, int[] d){
    double durchschnitt= a/d.length;
    System.out.println();
    System.out.println("Die Summe :\t"+a);
    System.out.println("Der Durchschnitt :\t"+durchschnitt);
    System.out.println("Die Maximale wert:\t"+b);
    System.out.println("Die Minimale Wert:\t"+c);
  }
    
}

