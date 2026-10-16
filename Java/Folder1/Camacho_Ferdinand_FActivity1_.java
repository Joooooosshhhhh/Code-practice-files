package Folder1;

import java.util.*;
public class Camacho_Ferdinand_FActivity1_
{
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);
        int grade;

        System.out.print("Enter your grade :");
        grade = input.nextInt();

        if (grade >= 95)
        {
            System.out.println("Congratulations! You are one of the students with the highest honors.");
        }

        else if (grade <= 94 && grade >= 90)
        {
            System.out.println("You are one of the students with honors.");
        }

        else if (grade <= 89 && grade >= 80)
        {
            System.out.println("You did a good job!");
        }

        else if (grade <= 79 && grade >= 70)
        {
            System.out.println("Your grade is below average.");
        }
        else if (grade < 70)
        {
            System.out.println("You have to retake the test.");
        }
    }
}
