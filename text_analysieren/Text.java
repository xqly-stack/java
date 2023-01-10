package text_analysieren;
import java.util.Scanner;

public class Text {
   public static void main(String[] args) {

      // Step 1
      Scanner scan = new Scanner(System.in);
      System.out.println("-------------------------------");
      System.out.printf("\nBitte geben Sie Ihren Text ein:");
      String text = scan.next();
      System.out.println("-------------------------------");

      // Step 2
      String textUPPER = text.toUpperCase();
      String textLOWER = text.toLowerCase();
      int strCount = text.length();
      
      // Step 3 - Endet der Text mit e oder E?
      boolean e_lower_upper = false;
      if (text.endsWith("E") || text.endsWith("e")) {
         e_lower_upper = true;
      }

      // Step 4 - Beginnt der Text mit a oder A?
      boolean a_lower_upper = false;
      if (text.startsWith("A") || text.startsWith("a")) {
         a_lower_upper = true;
      }

      // Step 5 - Wort Herr/herr vorhanden?
      boolean herr_lower_upper = false;
      if (text.contains("Herr") || text.contains("herr")) {
         herr_lower_upper = true;
      }

      // Step 6 - An welcher Stelle ist a zu finden
      // Check whether the letter "a" is in the text
      int index;
      if (text.contains("a")) {
         index = text.indexOf("a");
      }

      // Step 7 - Welcher Buchstabe an 4. Stelle des Textes
      int stelle = text.charAt(4);
   } 
}
