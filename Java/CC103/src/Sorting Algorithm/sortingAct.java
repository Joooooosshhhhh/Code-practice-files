public class sortingAct {
   public static void main (String[] args) {
      int[] array = {2, 5, 10, 7, 1, 4, 6};
      
      int[] sortedArray = sortSortSort(array);
      
      for (int a = 0; a < array.length; a++) {
         System.out.print(sortedArray[a] + " ");
      }
      
      binarySearch(sortedArray, 6);
   }
   
   public static int[] sortSortSort(int[] array) {
      
      for(int i = 1; i < array.length; i++) {
         int temp = array[i];
         int j = i - 1;
         
         while (j >= 0 && temp < array[j]) {
            array[j + 1] = array[j];
            j--;
         }
         
         array[j + 1] = temp;
         
      }
      
      return array;
   }
   
   public static void binarySearch(int[] sortedArray, int target) {
      int left = 0;
      int right = sortedArray.length - 1;
      
      while (left <= right) {
         int mid = (left + right) / 2;
         
         if (sortedArray[mid] == target) {
            System.out.println("Target found at index " + mid);
            return;
         }   
         
         else if (sortedArray[mid] < target)
            left = mid + 1;
         
         else
            right = mid - 1;
      }
      
   }

}