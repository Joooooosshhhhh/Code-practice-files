import java.util.*;

public class Problem5 {
   public static void main(String[] args) {
   
      Scanner input = new Scanner(System.in);
      
      System.out.print("Enter array size: ");
      int size = input.nextInt();
      
      int[] content = new int[size];
      
      for (int i = 0; i < content.length; i++) {
         System.out.print("number " + (i + 1) + ": ");
         content[i] = input.nextInt();
      }
      
      originalArray(content);
      
      selectionSort(content);
   
   }
   
   public static void originalArray(int[] content) {
      System.out.println("Original Array:");
      for (int a = 0; a < content.length; a++) {
         System.out.print(content[a] + " ");
      }
      System.out.println();
   }
   
   public static void selectionSort(int[] content) {
      
      
      for (int b = 0; b < content.length - 1; b++) {
         int min =b;
         for (int c = b + 1; c < content.length; c++) {
            if (content[min] > content[c]) {
               min = c;
            }
         }
         
         int temp = content[min];
         content[min] = content[b];
         content[b] = temp;
     
         
         System.out.print("round " + (b + 1) + ": ");

         for (int d = 0; d < content.length; d++) {
            System.out.print(content[d] + " ");
         }
         
         System.out.println();
         
      }
   }
}