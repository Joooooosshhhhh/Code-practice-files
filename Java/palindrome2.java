import java.util.*;

public class palindrome2 {
   public static void main(String[] args) {
      
      Scanner sc = new Scanner(System.in);
      
      System.out.println("--- Palindrome Checker ---");
      System.out.print("Enter word: ");
      String word = sc.nextLine().toLowerCase();
      word = word.replace( " ","");
      
      boolean isPalindrome = true;
      for(int i = 0; i < word.length() / 2; i++) {
         if(word.charAt(i) == (word.charAt(word.length()- 1 - i))) {
           continue;
         }
         
         else {
            isPalindrome = false;
            break;
         }
      }
      
      if (isPalindrome == true) {
         System.out.println(word + " is a palindrome!");
      }
      else {
         System.out.println(word + " is a NOT palindrome!");
      }
   
   }
}