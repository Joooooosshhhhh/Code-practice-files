package CC103.src;
import java.util.*;

public class PalindromeRecursion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String text = input.nextLine();

        text = text.toLowerCase();

        if (isPalindrome(text)) {
            System.out.println("the word is palindrome!");
        }
        else
            System.out.println("The word is NOT palindrome");
    }

    public static boolean isPalindrome(String word) {
        if (word.length() <=1 ) {
            return true;
        }

        if (word.charAt(0) != word.charAt(word.length()-1)) {
            return false;
        }

        return isPalindrome(word.substring(1, word.length() - 1));
    }
}
