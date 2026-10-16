import java.util.*;

public class StudentGradeAnalyzer {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Student Grade Analyzer ---");
        System.out.print("How many student?: ");
        int students = scanner.nextInt();scanner.nextLine();

        String[] names = new String[students];
        int[] grades = new int[students];

        int highest = grades[0];
        int lowest = grades [0];
        String topStudent = names[0];
        double total = 0;
        double average = 0;

        int i;
        for (i = 1; i <= students; i++) {
            System.out.println("\nstudent " + i);


            System.out.print("name: ");
            names[i-1] = scanner.nextLine();

            System.out.print("grade: ");
            grades[i-1] = scanner.nextInt();scanner.nextLine();

            total += grades[i-1];
            if (grades[i-1] > highest) {
                highest = grades[i-1];
                topStudent = names[i-1];
            }

            if (grades[i-1] < lowest) {
                lowest = grades[i-1];
            }

            average = total / students;
        }

        System.out.println("\nClass Summary:");
        System.out.println("Highest Grade: " + highest + " (" + topStudent + ")");
        System.out.println("Lowest Grade: " + lowest);
        System.out.println("Average Grade: " + average);

    }
}
