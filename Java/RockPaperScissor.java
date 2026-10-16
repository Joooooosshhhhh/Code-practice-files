import java.util.*;

public class RockPaperScissor {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      Random random = new Random();
   
      System.out.println("--- Rock, Paper, Scissor ---");
   
      boolean repeat = true;
   
      while (repeat) {
         System.out.print("\nEnter your input: ");
         String userInput = input.nextLine().toLowerCase();
      
         String[] choice = {"rock", "paper", "scissor"};
         String randomChoice = choice[random.nextInt(choice.length)];
      
         System.out.println("\nYour choice: " + userInput);
         System.out.println("Computer's choice: " + randomChoice);
      
         switch (randomChoice) {
            case "rock": {
               if (userInput.equals("rock")) {
                  System.out.println("Tie!");
               }
               else if (userInput.equals("paper")) {
                  System.out.println("you WON!");
               }
               else if (userInput.equals("scissor")) {
                  System.out.println("you LOST");
               }
               break;
            }
            case "paper": {
               if (userInput.equals("paper")) {
                  System.out.println("Tie!");
               }
               else if (userInput.equals("scissor")) {
                  System.out.println("you WON!");
               }
               else if (userInput.equals("rock")) {
                  System.out.println("you LOST");
               }
               break;
            }
            case "scissor": {
               if (userInput.equals("scissor")) {
                  System.out.println("Tie!");
               }
               else if (userInput.equals("rock")) {
                  System.out.println("you WON!");
               }
               else if (userInput.equals("paper")) {
                  System.out.println("you LOST");
               }
               break;
            }
         }
         System.out.print("again? Y/N: ");
         String again = input.nextLine().toLowerCase();
      
         if (!again.equals("y"))
            repeat = false;
      }
   }
}
