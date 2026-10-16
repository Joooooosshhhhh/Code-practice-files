import java.util.*;

public class GWA_calculator2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        System.out.println("\tWelcome to GWA calculator!");
        System.out.println("\texclude NSTP and PathFit");
        System.out.println("-------------------------------");
        System.out.print("Enter total subjects: ");
        int totalSubject = input.nextInt();

        double computation;
        double totalUnits = 0;
        double divisor = 0;


        for (int i = 1; i <= totalSubject; i++ ) {
            System.out.println("\nSubject no. " + i);
            System.out.print("grade: ");
            double grade = input.nextDouble();

            System.out.print("units: ");
            double units = input.nextDouble();
            totalUnits = units + totalUnits;

            computation = grade * units;
            divisor = computation + divisor;
        }

    double gwa = divisor / totalUnits;

    System.out.println("Final GWA: " + gwa);
        if (gwa <= 1.50) {
            System.out.println("President's Lister");
            System.out.println("Congratulations!");
        }
        else if (gwa <= 1.75) {
            System.out.println("Dean's Lister");
            System.out.println("Congratulations!");
        }
        else {
            System.out.print("No award");
            System.out.println("still, Congratulations!");
            }
    }
}
