import java.util.*;

public class GWA_calculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        boolean repeat = true;

        double totalUnit = 0;
        double divisor = 0;
        double computation;

        while (repeat) {

            System.out.print("\nEnter grades: ");
            double grades = input.nextDouble();

            if(grades == 0) {
                repeat = false;
            }

            System.out.print("Enter units: ");
            double units = input.nextDouble();
            totalUnit = units + totalUnit;

            double divisorComputation = grades * units;
            divisor = divisorComputation + divisor;

        }
        computation = divisor / totalUnit;

        System.out.println("Final grade: " + computation);
        System.out.println("Total units: " + totalUnit);

    }

}
