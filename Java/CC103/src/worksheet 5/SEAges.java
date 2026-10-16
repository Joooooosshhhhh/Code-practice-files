import java.util.*;

public class SEAges {
   public static void main(String[] args) {
   
     int[] ages = {22, 35, 28, 41, 30, 26, 39, 33, 27, 45,
     29, 31, 38, 24, 36, 40, 23, 34, 37, 25};
     
     Scanner input = new Scanner(System.in);
     
     System.out.print("Binary or Linear?: ");
     String choice = input.nextLine().toLowerCase();
     
     System.out.print("Enter the target number: ");
     int target = input.nextInt();
     
     int output = 0;
     if (choice.equals("linear")) {
         output = getLinear(ages, target);
     }
     
     else {
         output = getBinary(ages, target);

     }

      System.out.println("The index of number " + target + " is index " + output);
   
   }
   
   public static int getLinear(int[] ages, int target) {
      for (int i = 0; i < ages.length; i++) {
         if (ages[i] == target) {
            return i;
         }
      
      }
     return -1; 
   }
   
   public static int getBinary(int[] ages, int target) {
   
   Arrays.sort(ages);
   
   int start = 0;
   int end = ages.length - 1;
   
      while (start <= end) {
      
      int mid = (start + end) / 2;
      
         if (ages[mid] == target) {
         return mid;
         }
         
         else if (ages[mid] < target)
            start = mid + 1;
         
         else end = mid - 1;
      
      }
      return -1;
   }
   
}