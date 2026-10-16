package CC103.src;

import java.util.Scanner;

public class override {

    public static void main (String[] args) {
        Scanner reader = new Scanner(System.in);
        Calculator calc = new Basic();
        //first number
        System.out.print("Enter the first number: ");
        double num1 = reader.nextDouble();
        //operation
        System.out.print("Enter an operator(+,-,*,/): ");
        char operator = reader.next().charAt(0);
        //second number
        System.out.print("Enter the second number: ");
        double num2 = reader.nextDouble();
        double result;
        //switch case
        switch (operator) {
            case '+':
                result = calc.add(num1,num2);
                break;
            case '-':
                result = calc.minus(num1,num2);
                break;
            case '*':
                result = calc.multiply(num1,num2);
                break;
            case '/':
                if (num2!=0){
                    result = calc.divide(num1,num2);
                }
                else {
                    System.out.println("Error! Division by zero is not allowed.");
                    return;
                }
                break;
            default:
                System.out.println("Error! Operator is incorrect.");
                return;
        }
        System.out.println("\nResult: " + num1 + " " + operator + " " + num2 + " = " +
                result);
        reader.close();
    }
}
abstract class Calculator {
    abstract double add (double num1, double num2);
    abstract double minus (double num1, double num2);
    abstract double multiply (double num1, double num2);
    abstract double divide (double num1, double num2);
}

class Basic extends Calculator {
    @Override
    double add (double num1, double num2) {
        return num1 + num2;
    }
    @Override
    double minus (double num1, double num2) {
        return num1 - num2;
    }

    @Override
    double multiply (double num1, double num2) {
        return num1 * num2;
    }

    @Override
    double divide (double num1, double num2) {
        return num1 / num2;
    }
}