package Folder1;

import java.util.*;

public class Calimlim_MarlonJosh_FActivity2_ {
    public static void main (String[] args) {
        Scanner placeholder = new Scanner(System.in);

        int a = 0, b = 0, c = 0;

        System.out.print("Enter 1st number: ");
        a = placeholder.nextInt();

        System.out.print("Enter 2nd number: ");
        b = placeholder.nextInt();

        System.out.print("Enter 3rd number: ");
        c = placeholder.nextInt();


        if (a < b) {
            if (a < c) {
                if (b < c)
                    System.out.print(a + " " + b + " " + c);
                else
                    System.out.print(a + " " + c + " " + b);
            } else {
                System.out.print(c + " " + a + " " + b);
            }
        } else {
            if (b < c) {
                if (a < c)
                    System.out.print(b + " " + a + " " + c);
                else
                    System.out.print(b + " " + c + " " + a);
            } else {
                System.out.print(c + " " + b + " " + a);
            }
        }
    }
}
