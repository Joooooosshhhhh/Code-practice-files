package CC103.src;

import java.util.*;

public class activity_2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        choice();

        boolean order_repeat = true;
        int order_input;
        double budgetSpent = 0;

        int meat = 0;
        int bread = 0;
        int vegetables = 0;
        int dairy = 0;
        int eggs = 0;

        int price = 0;
        double discountPercent = 20.0;

        while (order_repeat) {
            System.out.println("----------------------------------");
            System.out.print("Enter the number of your choice: ");
            order_input = input.nextInt();

            if (order_input == 0) {
                order_repeat = false;
                break;
            } else if (order_input < 1 || order_input > 6) {
                System.out.println("Invalid choice!");
                continue;
            }


            switch(order_input) {
                case 1:
                    price = 200;
                    break;
                case 2:
                    price = 55;
                    break;
                case 3:
                    price = 50;
                    break;
                case 4:
                    price = 30;
                    break;
                case 5:
                    price = 10;
                    break;
                case 6:
                    price = (4 * 10) + (2 * 55) + (1 * 30);
                    break;
            }

            double discountedPrice = price * (1 - discountPercent / 100);

            if (budgetSpent + discountedPrice > 500) {
                System.out.println("Insufficient Budget! Item not added.");
                continue;
            }


            switch(order_input) {
                case 1:
                    meat++;
                    break;
                case 2:
                    bread++;
                    break;
                case 3:
                    vegetables++;
                    break;
                case 4:
                    dairy++;
                    break;
                case 5:
                    eggs++;
                    break;
                case 6:
                    eggs += 4;
                    bread += 2;
                    dairy += 1;
                    System.out.println("Breakfast bundle added!");
                    break;
            }

            budgetSpent += discountedPrice;

            if (budgetSpent >= 250 && budgetSpent - discountedPrice < 250) {
                System.out.println("---You've spent 50% of your budget!---");
            }

            System.out.println("Current spent (with discount): ₱" + budgetSpent);
        }

        double totalMeat = meatMethod(meat, discountPercent);
        double totalBread = breadMethod(bread, discountPercent);
        double totalVegetables = vegetablesMethod(vegetables, discountPercent);
        double totalDairy = dairyMethod(dairy, discountPercent);
        double totalEggs = eggsMethod(eggs, discountPercent);

        double remainingBudget = remainingBudget(budgetSpent);
        double totalSpent = total(totalMeat, totalBread, totalVegetables, totalDairy, totalEggs);

        System.out.println("\n\t \t--- Breakdown ---");
        System.out.println("Meat: ₱" + totalMeat + " (" + meat + " items)");
        System.out.println("Bread: ₱" + totalBread + " (" + bread + " items)");
        System.out.println("Vegetables: ₱" + totalVegetables + " (" + vegetables + " items)");
        System.out.println("Dairy: ₱" + totalDairy + " (" + dairy + " items)");
        System.out.println("Eggs: ₱" + totalEggs + " (" + eggs + " items)");
        System.out.println("----------------------------------");
        System.out.println("Total spent: ₱" + totalSpent);
        System.out.println("Remaining budget: ₱" + remainingBudget);
    }

    public static void choice() {
        System.out.println("\t\t--- Grocery ---");
        System.out.println("\t--- 20% Discount all items! ---");
        System.out.println("1. Meat = ₱200");
        System.out.println("2. Bread = ₱55");
        System.out.println("3. Vegetables = ₱50");
        System.out.println("4. Dairy = ₱30");
        System.out.println("5. Eggs = ₱10");
        System.out.println("6. Breakfast Bundle (4 Eggs, 2 Bread, 1 Dairy)");
        System.out.println("Press 0 = stop");
    }

    public static double total(double totalMeat,
                               double totalBread,
                               double totalVegetables,
                               double totalDairy,
                               double totalEggs) {
        return totalMeat + totalBread + totalVegetables + totalDairy + totalEggs;
    }

    public static double meatMethod(double meat, double discountPercent) {
        return meat * 200 * (1 - discountPercent / 100);
    }

    public static double breadMethod(double bread, double discountPercent) {
        return bread * 55 * (1 - discountPercent / 100);
    }

    public static double vegetablesMethod(double vegetables, double discountPercent) {
        return vegetables * 50 * (1 - discountPercent / 100);
    }

    public static double dairyMethod(double dairy, double discountPercent) {
        return dairy * 30 * (1 - discountPercent / 100);
    }

    public static double eggsMethod(double eggs, double discountPercent) {
        return eggs * 10 * (1 - discountPercent / 100);
    }

    public static double remainingBudget(double budgetSpent) {
        return 500 - budgetSpent;
    }
}
