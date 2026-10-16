import java.util.*;

public class problem4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int size = sc.nextInt();

        int[] number = new int[size];

        for (int i = 0; i < number.length; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            number[i] = sc.nextInt();
        }

        getBubbleSort(number);

        System.out.println("Sorted array:");

        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i] + " ");
        }
    }

    public static void getBubbleSort(int[] number) {

    for (int j = 0; j < number.length - 1; j++) {

        for (int k = 0; k < number.length - j - 1; k++) {

            if (number[k] > number[k + 1]) {

                int temp = number[k];
                number[k] = number[k + 1];
                number[k + 1] = temp;
            }
        }

        // Print the array after each pass
        System.out.print("Round " + (j + 1) + ": ");

        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i] + " ");
        }

        System.out.println();
    }
}
}