package CC103.src;

import java.util.*;

public class methodPractice1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double budgetSpent = 0;
        double discount = 10;
        double price;
        boolean repeat = true;
        boolean warning = false;
        boolean warning2 = false;

        int coffee = 0;
        int milkTea = 0;
        int juice = 0;
        int soda = 0;

        menu();

        while (repeat) {
            System.out.print("Enter the number of your choice: ");
            int choice = scanner.nextInt();

            if (choice == 0) {
                repeat = false;
            }

            price = switch (choice) {
                case 1 -> 80;
                case 2 -> 100;
                case 3 -> 60;
                case 4 -> 40;
                case 5 -> (80 * 2) + 60;
                default -> 0;
            };

            double discountPrice = discountPriceMethod(price, discount);

            budgetSpent += discountPrice;

            System.out.println("current spent (with discount): " + budgetSpent);


            warning = warningMethod(budgetSpent, warning);

            warning2 = warning2gMethod(budgetSpent, warning2);

            System.out.println("----------------------------------");

            switch (choice) {
                case 1:
                    coffee++;
                    break;
                case 2:
                    milkTea++;
                    break;
                case 3:
                    juice++;
                    break;
                case 4:
                    soda++;
                    break;
                case 5:
                    coffee += 2;
                    juice ++;
                    break;
            }

        }

        double totalCoffee = totalCoffeeMethod( coffee,  discount);
        double totalMilkTea = totalMilkTeaMethod( milkTea,  discount);
        double totalJuice =  totalJuiceMethod( juice,  discount);
        double totalSoda = totalSodaMethod( soda,  discount);

        System.out.println("\t--- Item Breakdown ---");
        System.out.println("1. Coffee: ₱" + totalCoffee + " (" + coffee + " items)");
        System.out.println("2. Milk Tea: ₱" + totalMilkTea + " (" + milkTea + " items)");
        System.out.println("3. Juice: ₱" + totalJuice + " (" + juice + " items)");
        System.out.println("4. Soda: ₱" + totalSoda + " (" + soda + " items)");
        System.out.println("----------------------------------");
        System.out.println("Total Spent: ₱" + budgetSpent);
        System.out.println("Remaining Budget: ₱" + (300 - budgetSpent));
    }

    public static void menu() {
        System.out.println("\t   --- Beverage Menu ---");
        System.out.println("--- 10% Discount on all drinks! ---");
        System.out.println("budget: ₱300");
        System.out.println("\n1. Coffee = ₱80");
        System.out.println("2. Milk Tea = ₱100");
        System.out.println("3. Juice = ₱60");
        System.out.println("4. Soda = ₱40");
        System.out.println("5. Combo Pack (2 Coffee + 1 Juice)");
        System.out.println("Press 0 to stop ordering");
        System.out.println("----------------------------------");
    }

    public static boolean warningMethod(double budgetSpent, boolean warning) {
        if (budgetSpent > 150  && !warning) {
            System.out.println("--- You've spent 50% of your budget! ---");
            return true;
        }
        return warning;
    }

    public static boolean warning2gMethod(double budgetSpent, boolean warning2) {
        if (budgetSpent > 300  && !warning2) {
            System.out.println("--- You've spent way over your budget! ---");
            return true;
        }
        return warning2;
    }
    public static double discountPriceMethod(double price, double discount) {
        return price * (1 - discount / 100);
    }

    public static double  totalCoffeeMethod(int coffee, double discount) {
        return coffee * 80 * (1 - discount / 100);
    }
    public static double  totalMilkTeaMethod(int milkTea, double discount) {
        return milkTea * 100 * (1 - discount / 100);
    }
    public static double  totalJuiceMethod(int juice, double discount) {
        return juice * 60 * (1 - discount / 100);
    }
    public static double  totalSodaMethod(double soda, double discount) {
        return soda * 40 * (1 - discount / 100);
    }


}