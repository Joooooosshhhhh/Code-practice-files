package Folder1;

import java.util.*;

public class calimlim_case_study_no1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String again;
        do {
            System.out.println("\t A. Paper");
            System.out.println("\t B. Scissor");
            System.out.println("\t C. Stone");
            System.out.println("==========================");

            System.out.print("Person 1 pick: ");
            String p1 = input.nextLine();

            System.out.print("Person 2 pick: ");
            String p2 = input.nextLine();

            if (p1.equals("A") || p1.equals("a")) {
                if (p2.equals("A") || p2.equals("a"))
                    System.out.println("Tie");
                else if (p2.equals("B") || p2.equals("b"))
                    System.out.println("Scissor wins. Player 2 Wins!");
                else if (p2.equals("C") || p2.equals("c"))
                    System.out.println("Paper wins. Player 1 Wins!");
            }

            else if (p1.equals("B") || p1.equals("b")) {
                if (p2.equals("B") || p2.equals("b"))
                    System.out.println("Tie");
                else if (p2.equals("A") || p2.equals("a"))
                    System.out.println("Scissor wins. Player 1 Wins!");
                else if (p2.equals("C") || p2.equals("c"))
                    System.out.println("Stone wins. Player 2 Wins!");
            }

            else if (p1.equals("C") || p1.equals("c")) {
                if (p2.equals("C") || p2.equals("c"))
                    System.out.println("Tie");
                else if (p2.equals("A") || p2.equals("a"))
                    System.out.println("Paper wins. Player 2 Wins!");
                else if (p2.equals("B") || p2.equals("b"))
                    System.out.println("Stone wins. Player 1 Wins!");
            }

            else
                System.out.println("Invalid Output");

            System.out.print("Play again? (yes/no: ");
             again = input.nextLine().toLowerCase();
        } while (again.equals("yes"));

        System.out.print("Good bye!");

    }
}
