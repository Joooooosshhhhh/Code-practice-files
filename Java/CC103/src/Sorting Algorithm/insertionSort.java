public class insertionSort {
   public static void main(String[] args) {
      int[] array = {5, 3, 4, 1, 2};
      
      insertionsort(array);
   }
   
   public static void insertionsort(int[] array) {
      for (int i = 1; i < array.length; i++) {
         int temp = array[i];
         int j = i - 1;
         
         while (j >= 0 && temp < array[j]) {
            array[j + 1] = array[j];
            j--;
         }
         array[j + 1] = temp;
         
         for (int k = 0; k < array.length; k++) {
            System.out.print(array[k] + " ");
         }
         
         System.out.println();
      }
  
   }
}