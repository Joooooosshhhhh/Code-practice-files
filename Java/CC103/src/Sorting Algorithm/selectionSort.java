public class selectionSort {
   public static void main(String[] args) {
      int[] array = {5, 3, 4, 1, 2};   
      
      for (int l = 0; l < array.length; l++) {
            System.out.print(array[l] + " ");
      }
      System.out.println();
      System.out.println("---------");
      
      selectionSort(array);  
   }
   
   public static void selectionSort(int[] array) {
      
      for(int i = 0; i < array.length; i++) {
         
         int min = i;
         
         for(int j = i + 1; j < array.length; j++) {
            if (array[j] < array[min]) {
               min = j;
               
            }
         }
         
         int temp = array[min];
         array[min] = array[i];
         array[i] = temp;
         
         for (int k = 0; k < array.length; k++) {
            System.out.print(array[k] + " ");
         }
         System.out.println();
          
     } 
      
   }
}