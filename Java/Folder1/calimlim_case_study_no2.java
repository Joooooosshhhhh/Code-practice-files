package Folder1;

import java.util.*;

public class calimlim_case_study_no2 {
    public static void main (String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println (" \t Welcome to IT airlines!");
        System.out.println ("=================================");

        System.out.print ("Enter your name: ");
        String name =input.nextLine();

        System.out.print ("Enter your age: ");
        int age =input.nextInt();
        input.nextLine();

        if (age <= 12 || age >= 65)
            System.out.print("Hello " + name + ". You are eligible for the 15% discount. ");

        else
            System.out.print("Hello " + name + ". You are NOT eligible for the 15% discount. ");
    }
}
