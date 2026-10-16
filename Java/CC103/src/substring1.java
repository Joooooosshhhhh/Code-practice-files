package CC103.src;

import java.util.Scanner;

public class substring1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = input.nextLine();

        displayPattern(text);
    }

    public static void displayPattern(String word) {

        if (word.length() == 0) {
            return;
        }

        System.out.println(word);

        displayPattern(word.substring(0, word.length() - 1));


    }
}