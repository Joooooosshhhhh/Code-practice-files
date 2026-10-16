package Folder1;

import java.util.*;

public class Calculator1 {
   public static void main (String[] args) {
      
      Scanner input = new Scanner(System.in);

      int num1, num2;
      String symbol;

      System.out.println("\n CC103.Calculator");
      System.out.print("Enter first number: ");
      num1 = input.nextInt();

      System.out.print("Choose a symbol +  |  -  |  *  |  /  : ");
      symbol = input.next();

       System.out.print("Enter second number: ");
       num2 = input.nextInt();

       if (symbol.equals("+"))
           System.out.print("The sum is: " + (num1 + num2));

       else if (symbol.equals("-"))
           System.out.print("The difference is: " + (num1 - num2));

       else if (symbol.equals("*"))
           System.out.print("The product is: " + (num1 * num2));

       else if (symbol.equals("/"))
           System.out.print("The quotient is: " + (num1 / num2));

       else
           System.out.print("Symbol is invalid. Try again");
   }

}