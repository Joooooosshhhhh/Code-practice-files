import java.util.*;

public class jGRASP_practice_file1 {
   
   public static void main (String[] args) {
      Scanner placeholder = new Scanner(System.in);

      System.out.print("Enter a number: ");
      int num = placeholder.nextInt();
      placeholder.nextLine();

       System.out.print("Enter a color: ");
       String color = placeholder.nextLine();

       System.out.println ("number: " + num);
       System.out.println ("color: " + color);

   }

}