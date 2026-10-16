package CC103.src;

import java.util.Scanner;

public class override_exercise1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        boolean repeat = true;

        while(repeat) {

            calculation answer = new solution();

            System.out.println("Enter a number");
            System.out.println("1. Circle");
            System.out.println("2. Rectangle");
            System.out.println("3. Triangle");

            System.out.print("Enter your choice: ");
            char choice = input.next().charAt(0);

            double result;
            switch (choice) {

                case '1': {
                    System.out.print("Enter radius: ");
                    double radius = input.nextDouble();
                    result = answer.circle(radius);

                    System.out.println("The area of your circle is: " + result);
                    break;
                }

                case '2': {
                    System.out.print("Enter length: ");
                    double length = input.nextDouble();
                    System.out.print("Enter width: ");
                    double width = input.nextDouble();
                    result = answer.rectangle(length, width);

                    System.out.println("The area of your rectangle is: " + result);
                    break;
                }

                case '3': {
                    System.out.print("Enter base: ");
                    double base = input.nextDouble();
                    System.out.print("Enter height: ");
                    double height = input.nextDouble();
                    result = answer.triangle(base, height);

                    System.out.println("The area of your triangle is: " + result);
                    break;
                }
            }

            System.out.println("----------------------------------------");
            System.out.print("again? Y/N: ");
            char repeat_choice = input.next().toLowerCase().charAt(0);

            if (repeat_choice != 'y') {
                repeat = false;
                System.out.println("Goodbye!");
            }
        }



    }
}

abstract class calculation {
    abstract double circle(double radius);

    abstract double rectangle(double length, double width);

    abstract double triangle(double base, double height);
}

class solution extends calculation {
    @Override
    double circle(double radius) {
        return 3.14159 * radius * radius;
    }

    @Override
    double rectangle(double length, double width) {
        return length * width;
    }

    @Override
    double triangle(double base, double height) {
        return 0.5 * base * height;
    }
}
