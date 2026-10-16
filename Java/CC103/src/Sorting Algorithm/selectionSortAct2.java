public class selectionSortAct2 {
   public static void main(String[] args) {
      int[] array =  {2, 5, 10, 7, 1, 4, 6};
      
      selectionSort(array);
   }
   
   public static void selectionSort(int[] array) {
      
      for (int i = 0; i < array.length; i++) {
         
         int min = i;
         for (int j = i + 1; j < array.length; j++) {
            if (array[j] < array[min]) {
               min = j;
            }   
            
         }
         
         int temp = array[i];
         array[i] = array[min];
         array[min] = temp;
         
         for (int k = 0; k < array.length; k++) {
            System.out.print(array[k] + " ");
         }
         System.out.println();
      }
   }
}