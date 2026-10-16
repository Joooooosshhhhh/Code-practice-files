//public class practice1 {
//    public static void main (String[] args) {
//        System.out.println("        JJ     AAAAAAAAAAAA     VV          VV     AAAAAAAAAAAA");
//        System.out.println("        JJ     AA        AA      VV        VV      AA        AA");
//        System.out.println("        JJ     AA        AA       VV      VV       AA        AA");
//        System.out.println("        JJ     AAAAAAAAAAAA        VV    VV        AAAAAAAAAAAA");
//        System.out.println("        JJ     AA        AA         VV  VV         AA        AA");
//        System.out.println("JJJJJJJJJJ     AA        AA          VVVV          AA        AA");
//    }
//}

//import java.util.*;
//public class practice1 {
//    public static void main (String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter your name: ");
//        String name = scanner.nextLine();
//
//        System.out.println("Hi "+ name + "!");
//    }
//
//}
//

//import java.util.*;
//public class practice1 {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("First number: ");
//        int first_number = scanner.nextInt();
//
//        System.out.print("Second number: ");
//        int second_number = scanner.nextLine();
//
//        System.out.println(first_number + " + " + second_number + " = " + (first_number + second_number));
//    }
//}



//import java.util.Scanner;
//public class practice1 {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("What's your name: ");
//        String name = scanner.nextLine();
//
//        System.out.print("Hi " + name + "!");
//    }
//
//}




//public class practice1 {
//    public static void main(String[] args) {
//       String word = "hello";
//
//        recursion(word);
//    }
//
//    public static void recursion(String str) {
//
//        if (str.length() == 0) {
//            return;
//        }
//
//        System.out.println(str);
//
//        recursion(str.substring(0, str.length() - 1));
//    }
//
//}



import java.util.Scanner;

class practice1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter input: ");
        String input = scanner.nextLine();

        recursion(input);
    }

    public static void recursion(String input) {
        if (input.length() == 0
    ) {
            return;
        }
        System.out.println(input);
        recursion(input.substring(0, input.length()-1));
    }

}





















































































