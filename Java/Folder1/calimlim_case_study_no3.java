package Folder1;

import java.util.*;
public class calimlim_case_study_no3 {
    public static void main (String[] args) {

        Scanner input = new Scanner (System.in);

        System.out.print("Enter a number from 1-35: ");
        int num = input.nextInt();

       if (num <= 9)
           System.out.print(num);

       else if (num >= 10 && num <=35) {
           switch (num) {

               case 10:
                   System.out.print("A");
                   break;
               case 11:
                   System.out.print("B");
                   break;
               case 12:
                   System.out.print("C");
                   break;
               case 13:
                   System.out.print("D");
                   break;
               case 14:
                   System.out.print("E");
                   break;
               case 15:
                   System.out.print("F");
                   break;
               case 16:
                   System.out.print("G");
                   break;
               case 17:
                   System.out.print("H");
                   break;
               case 18:
                   System.out.print("I");
                   break;
               case 19:
                   System.out.print("J");
                   break;
               case 20:
                   System.out.print("K");
                   break;
               case 21:
                   System.out.print("L");
                   break;
               case 22:
                   System.out.print("M");
                   break;
               case 23:
                   System.out.print("N");
                   break;
               case 24:
                   System.out.print("O");
                   break;
               case 25:
                   System.out.print("P");
                   break;
               case 26:
                   System.out.print("Q");
                   break;
               case 27:
                   System.out.print("R");
                   break;
               case 28:
                   System.out.print("S");
                   break;
               case 29:
                   System.out.print("T");
                   break;
               case 30:
                   System.out.print("U");
                   break;
               case 31:
                   System.out.print("V");
                   break;
               case 32:
                   System.out.print("W");
                   break;
               case 33:
                   System.out.print("X");
                   break;
               case 34:
                   System.out.print("Y");
                   break;
               case 35:
                   System.out.print("Z");
                   break;
           }
       }

       else
           System.out.print ("Invalid Number");
    }
}
