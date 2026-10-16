package CC103.src;

import java.util.*;

public class override_practice {
    public static void main(String[] args) {

        SimpleCalculator placeholder = new Calculatorr();
        Scanner input = new Scanner(System.in);

        boolean repeat = true;

        while(repeat) {
            System.out.println("\t Simple CC103.Calculator");

            System.out.print("Enter first number: ");
            double num1 = input.nextDouble();
            System.out.print("Enter operator: ");
            char operator = input.next().charAt(0);
            System.out.print("Enter second number: ");
            double num2 = input.nextDouble();

            double result = 0;

            switch (operator) {
                case '+': {
                    result = placeholder.add(num1, num2);
                    break;
                }

                case '-': {
                    result = placeholder.subtract(num1, num2);
                    break;
                }

                case '*': {
                    result = placeholder.multiply(num1, num2);
                    break;
                }

                case '/': {
                    if (num2 != 0) {
                        result = placeholder.divide(num1, num2);

                    }

                    else {
                        System.out.println("Error");
                        continue;
                    }
                    break;
                }

                default:
                    System.out.println("Invalid operator!");
                    continue;

            }

            System.out.println(num1 + " " + operator + " " + num2 + " = " + result);

            System.out.print("again? Y/N: ");
            char again = input.next().toLowerCase().charAt(0);

            if (again != 'y') {
                repeat = false;
                System.out.println("Goodbye!");
            }
        }

    }
}

abstract class SimpleCalculator {
    abstract double add(double num1, double num2);
    abstract double subtract(double num1, double num2);
    abstract double multiply(double num1, double num2);
    abstract double divide(double num1, double num2);
}

class Calculatorr extends SimpleCalculator {
    @Override
    double add(double num1, double num2) {
        return num1 + num2;
    }

    @Override
    double subtract(double num1, double num2) {
        return num1 - num2;
    }

    @Override
    double multiply(double num1, double num2) {
        return num1 * num2;
    }

    @Override
    double divide(double num1, double num2) {
        return num1 / num2;
    }
}