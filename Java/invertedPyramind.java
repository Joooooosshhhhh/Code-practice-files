import java.util.*;

public class invertedPyramind {
   public static void main(String[] args) {
      
      Scanner sc = new Scanner(System.in);
      
      System.out.print("Enter height: ");
      int height = sc.nextInt();
      
      for (int i = height; i > 0; i--) {
               
         for(int space = height ; space - i > 0; space--) {
            System.out.print(" ");
         }
         
         for (int asterisk = i * 2 - 1 ; asterisk > 0; asterisk--) {
            System.out.print("*");
         }
         
         System.out.println();
      }
   }
}