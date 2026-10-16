public class bubbleAct1 {
   public static void main (String[] args) {
      int[] array = { 2, 5, 10, 7, 1, 4, 6};
      
      bubbleSort(array);
   }
   
   public static void bubbleSort(int[] array) {
   
      for (int i = 0; i < array.length - 1; i++) {
         
         for (int j = 0; j < array.length - i - 1; j++) {
            if (array [j] > array[j + 1]) {
               int temp = array[j];
               array[j] = array[j + 1];
               array[j + 1] = temp;
            }
         }
         
         for (int k = 0; k < array.length; k++) {
            System.out.print(array[k] + " ");
         }
         
         System.out.println();
      }
   
   }
}