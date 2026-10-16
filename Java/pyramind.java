import java.util.*;

public class pyramind {
   public static void main(String[] args) {
      
      Scanner sc = new Scanner(System.in);
      
      System.out.print("Enter height: ");
      int height = sc.nextInt();
      
      for (int i = 0; i < height; i++) {
         
         for(int j = 0; j < height - i - 1; j++) {
            System.out.print(" ");  
         }
         
         for (int k =  i * 2 + 1; k > 0; k--) {
            System.out.print("*");
         }
         
         System.out.println();
         
      }
   }
}