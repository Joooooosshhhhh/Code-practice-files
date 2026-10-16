package CC103.src;

import java.util.Scanner;
public class atm {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double balance = 1000.00; // Starting balance
        boolean running = true;

        System.out.println("Welcome to the Student Bank!");

        while (running) {
            System.out.println("\n1. View Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = input.nextInt();

            if (choice == 1) {
                // Logic for viewing balance
                choice1(balance);
            }
            else if (choice == 2) {
                // Logic for deposit
                System.out.print("Enter deposit amount: ");
                double amount = input.nextDouble();
                if (amount > 0) {
                   balance = choice2(balance, amount);
                    System.out.println("Successfully deposited $" + amount);
                } else {
                    System.out.println("Invalid amount.");
                }
            }
            else if (choice == 3) {
                // Logic for withdrawal
                System.out.print("Enter withdrawal amount: ");
                double amount = input.nextDouble();
                if (amount > 0 && amount <= balance) {
                    balance = choice3(balance, amount);
                    System.out.println("Successfully withdrew $" + amount);
                } else {
                    System.out.println("Insufficient funds or invalid amount.");
                }
            }
            else if (choice == 4) {
                running = false;
                System.out.println("Thank you for using our ATM!");
            }
            else {
                System.out.println("Invalid choice.");
            }
        }
        input.close();
    }

    public static void choice1(double balance) {
        System.out.println("Your current balance is: $" + balance);
    }

    public static double choice2(double balance, double amount) {
        return balance + amount;
    }

    public static double choice3(double balance, double amount) {
        return balance - amount;
    }
}