package Folder1;
/**
import javax.Folder1.swing.*;
public class Folder1.swing
{
    public static void main(String[] args)
    {

        String name;
        String add;
        name=JOptionPane.showInputDialog("Enter your:");
        add= JOptionPane.showInputDialog("Enter your address:");
        JOptionPane.showMessageDialog(null,"Your name is  " + name,
                "NAME",JOptionPane.WARNING_MESSAGE);
        JOptionPane.showMessageDialog(null,"Your address is  " + add,
                "ADDRESS",JOptionPane.ERROR_MESSAGE);
        System.exit(0);
    }
}

 import java.util.*;
 public class UsingIf_Else
 {
 public static void main(String [] args)
 {
 Scanner read = new Scanner(System.in);
 int edad;

 System.out.print("Enter your age: ");
 edad = read.nextInt();
 if(edad >=18)
 {
 System.out.println("you are eligible to vote");
 System.out.println("you are now in legal age");
 }
 else
 {
 System.out.println("you are still a minor");
 System.out.println("you cannot vote for President");
 }
 }
 }

*/
import javax.swing.*;
public class swing {

    public static void main (String[] args) {

       String Fname, Lname, age;


       Fname = JOptionPane.showInputDialog(null, "Enter your first name: ", "First name", JOptionPane.QUESTION_MESSAGE);
       Lname = JOptionPane.showInputDialog("Enter your last name: ", JOptionPane.INFORMATION_MESSAGE);
       age = JOptionPane.showInputDialog("Enter your age: ", JOptionPane.ERROR_MESSAGE);
       int agePlaceholder = Integer.parseInt(age);

       JOptionPane.showMessageDialog(null,
               "Your name is " + Fname + " " + Lname + "\n You are "+ agePlaceholder + " years old",
               "Greetings",
               JOptionPane.WARNING_MESSAGE);

       System.exit(0);

    }
}