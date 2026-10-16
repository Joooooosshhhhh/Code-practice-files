public class bubbleSort {
   public static void main (String[] args) {
      
      int[] array =  {5, 3, 4, 1, 2};
      
      
      bubbleSort(array);
      
      for (int i = 0; i < array.length; i++) {
         System.out.print(array[i] + " ");
      }
      
   }
   
   public static void bubbleSort(int[] array) {
   
   int n = array.length;
      for (int i = 0; i < n - 1; i++) {
         for (int j = 0; j < n - i - 1; j++) {
            if (array[j] > array[j+1]) {
               int temp = array[j];
               array[j] = array[j + 1];
               array[j + 1] = temp;
            
            }
           
         }
         
         for (int k = 0; k < n; k++) {
            System.out.print(array[k] + " ");
         }
         System.out.println();
      }
   
   }
}