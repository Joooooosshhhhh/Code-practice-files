public class insertionPractice {
   public static void main (String[] args) {
      int[] arr = {8, 3, 6, 1, 10, 4};
      
      bubbleSort(arr);
      System.out.println();
      selectionSort(arr);
      System.out.println();
      insertionSort(arr);
   }
   
   public static void  bubbleSort(int[] arr) {
      
      for (int i = 0; i < arr.length - 1; i++) {
         for (int j = 0; j < arr.length - i - 1; j++) {
            if (arr[j + 1] < arr[j]) {
               
               int temp = arr[j];
               arr[j] = arr[j + 1];
               arr [j + 1] = temp;
            }
         }
         
         for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k] + " ");
         }
         
         System.out.println();
         
      }
   }
   
   public static void selectionSort(int[] arr) {
      
      for (int i = 0; i < arr.length; i++) {
         int min = i;
         
         for (int j = 1 + min; j < arr.length; j++) {
            if (arr[j] < arr[min]) {
               min = j;
            }
         }
         
         int temp = arr[min];
         arr[min] = arr[i];
         arr[i] = temp;
         
         for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k] + " ");
         }
         
         System.out.println();
      }
   }
   
   public static void insertionSort(int[] arr) {
   
      for (int i = 1; i < arr.length; i++) {
         int temp = arr[i];
         int j = i - 1;
         
         while(j >= 0 && temp < arr[j]) {
            arr[j + 1] = arr[j];
            j--;
         }
         
         arr[j + 1] = temp;
         
         for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k] + " ");
         }
         
         System.out.println();

         
      }
   
   }
}