import java.util.*;

public class dice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        boolean repeat = true;
        while (repeat) {
            System.out.print("\nEnter a number from 1/6: ");

            int num = input.nextInt();
            input.nextLine();
            int randomNum = rand.nextInt(1, 7);

            System.out.println("\nyour input: " + num);
            System.out.println("computer number: " + randomNum);

            if (num == randomNum) {
                System.out.println("You WIN!");
            } else {
                System.out.println("You lost");
            }

            System.out.println("Again? Yes/No?");
            String again = input.nextLine().toLowerCase();

            if (again.equals("no"))
                repeat = false;
        }
    }
}
