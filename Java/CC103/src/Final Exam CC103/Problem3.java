import java.util.*;

public class Problem3 {
   public static void main(String[] args) {
   
      Scanner input = new Scanner(System.in);
   
      int[] quantities = {12, 28, 8, 30, 15, 20, 18, 10, 5, 22, 
                           28, 35, 40, 7, 16, 9, 14, 27, 33, 6};
   
      for(int i = 0; i < quantities.length; i++) {
         System.out.print(quantities[i] + " ");
      }
      
      System.out.println();
      
      System.out.print("Linear or Binary?: ");
      String type =  input.nextLine().toLowerCase();
      
      System.out.print("Target number: ");
      int target = input.nextInt();
      
      int result = 0;
      if (type.equals("linear")) {
         result = getLinearSearch(target, quantities);
      }
      
      else if (type.equals("binary")) {
         Arrays.sort(quantities);
         
         for (int b = 0; b < quantities.length; b++) {
            System.out.print(quantities[b] + " ");
         }

         
         result = getBinarySearch(target, quantities);         
         System.out.println();
      }
      
      else {
         System.out.println("None of the choices");
      }
      
      if (result == -1) {
           System.out.println("Target: " + target);
         System.out.println("index: target is invalid");
      }
      
      else {
         System.out.println("Target: " + target);
         System.out.println("index: " + result);

      }
      
   }
   
   
   
   public static int getLinearSearch(int target, int[] quantities) {
      for(int a = 0; a < quantities.length; a++ ) {
         if (quantities[a] == target) {
            return a;
         }
      }
      return -1;
   }
   
   public static int getBinarySearch(int target, int[] quantities) {
      int left = 0;
      int right = quantities.length - 1;
      
      while (left <= right) {
         int mid = (left + right) / 2;
         
         if (quantities[mid] == target) {
            return mid;
         }
         
         else if (target > quantities[mid]) {
            left = mid + 1;
         }
         
         else if (target < quantities[mid]) {
            right = mid - 1;
         }
         
      }
      return -1;
   }

}