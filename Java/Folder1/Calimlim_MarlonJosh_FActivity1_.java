package Folder1;

import java.util.*;

public class Calimlim_MarlonJosh_FActivity1_ {
    public static void main(String[] args) {

        Scanner placeholder = new Scanner(System.in);

        int grade;

        System.out.print("Enter your grade: ");
        grade = placeholder.nextInt();

        if (grade >= 95)
            System.out.println("With Highest Honor!");

        else if (grade >= 90)
            System.out.println("With Honor!");

        else if (grade >= 80)
            System.out.println("Good Job!");

        else
            System.out.println("Retake the test");
    }
}

