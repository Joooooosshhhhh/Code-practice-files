import java.util.*;

public class substringSlicer {
   public static void main (String[] args) {
      Scanner sc = new Scanner(System.in); 
      
      System.out.print("Enter word: ");
      String word = sc.nextLine();
      
      
      for(int i = 0; i < word.length(); i++) {
         System.out.println(word.substring(0 + i, word.length()));
      }
      
      for(int j = 0; j < word.length(); j++) {
         System.out.println(word.substring(0, word.length() - j));
      }
   }   
}