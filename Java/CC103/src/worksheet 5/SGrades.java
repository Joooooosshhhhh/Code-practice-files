import java.util.*;

public class SGrades {
   public static void main(String[] args) {
      int[] grades = {85, 90, 78, 92, 88, 76, 95, 89, 84, 91,
      73, 87, 93, 80, 86, 79, 94, 82, 77, 81, 96, 83, 75, 97, 98};
      
      Scanner input = new Scanner(System.in);
      
      System.out.print("Linear or Binary: ");
      String searchChoice = input.nextLine().toLowerCase();
      
      System.out.print("your number Choice: ");
      int numChoice = input.nextInt();
      
      if (searchChoice.equals("linear")) {
         getLinear(grades, numChoice);
      }
      
      else {
         getBinary(grades, numChoice);
      }
   }
   
   public static void getLinear(int[] grades, int numChoice) {
      for (int i = 0; i < grades.length; i++) {
         if (grades[i] == numChoice) {
            System.out.println("The index of number " + numChoice + " is index " + i);
         }
      
      }
   }
   
   public static void getBinary(int[] grades, int numChoice) {
      Arrays.sort(grades);
      
      int start = 0;
      int end = grades.length - 1;
      
      while (start <= end) {
         int mid = (start + end) / 2;
         
         if (grades[mid] == numChoice) {
            System.out.println("Number found at index " + mid);
            return;
         }
         
         else if (numChoice < grades[mid]) {
            end = mid - 1;
         }
         
         else {
            start = mid + 1;
         }
      
      }
      
   System.out.println("Number not found.");
   
   }
   
}