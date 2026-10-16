import java.util.Scanner;

public class avg {
   public static void main (String[] args) {
      
      Scanner input = new Scanner(System.in);
      
      System.out.print("Your name is: ");
      String name = input.nextLine();
      
      System.out.print("Your first quiz score: ");
      int Score1 = input.nextInt();
      
      System.out.print("Your second quiz score: ");
      int Score2 = input.nextInt();
      
      System.out.print("Your third quiz score: ");
      int Score3 = input.nextInt();
         
      int total = Score1 + Score2 + Score3;
      int avg = total / 3;
      
      System.out.println("Hi " + name + "!");
      System.out.println("Your average score is: " + avg);
   }
}