import java.util.*;

public class SPQuantities {
   public static void main(String[] args) {
   
      int[] quantities = {12, 25, 8, 30, 15, 20, 18, 10, 5, 22, 28, 35, 40, 7, 16, 9, 14, 27, 33, 6};
      
      Scanner input = new Scanner(System.in);
      
      for (int i = 0; i < quantities.length; i++) {
         System.out.print(quantities[i] + " ");
         
      }
      System.out.println();
      
      System.out.print("Linear or Binary: ");
      String choice = input.nextLine().toLowerCase();
      
      System.out.print("Enter the target number: ");
      int target = input.nextInt();
      
      
      int output = 0;
      
      if (choice.equals("linear")) {
         output = getLinear(quantities, target);
      }
   
      else {
          Arrays.sort(quantities);
         
         for (int i = 0; i < quantities.length; i++) {
            System.out.print(quantities[i] + " ");
         }
         
          System.out.println();
         output = getBinary(quantities, target);
      }
      
      System.out.println("The index of number " + target + " is index " + output);
   
   }
   
   public static int getLinear(int[] quantities, int target) {
      for (int x = 0; 0 < quantities.length; x++) {
         if (quantities[x] == target)
            return x;
      }
      return -1;
   }
   
   public static int getBinary(int[] quantities, int target) {
   
     
      int start = 0;
      int end = quantities.length - 1;
      
      while (start <= end) {
         int mid = (start + end) / 2;
         
         if (quantities[mid] == target) {
            return mid;
         }
         
         else if (target < quantities[mid]) {
            end = mid - 1;
         }
         
         else {
            start = mid + 1;
         }
      
      }
      return -1;
   
   
   }
}