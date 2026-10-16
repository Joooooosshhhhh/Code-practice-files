package CC103.src;
import java.util.*;

public class recursion1 {

    public static int power(int base, int exponent) {

        if (exponent > 0) {
            return base * power(base, exponent - 1);
        }
        else {
            return 1;
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter base: ");
        int base = input.nextInt();

        System.out.print("Enter exponent: ");
        int exponent = input.nextInt();

        System.out.println("Answer: " + power(base, exponent));
    }
}
