public class problem_1 {
   public static void main(String[] args) {
   
      int[][] numbers = {
         {5, 10, 15},
         {20, 25, 30}
      };
      
      int highest = 0;
      for(int i = 0; i < numbers.length; i++) {
         for(int j = 0; j <numbers[i].length; j++) {
            System.out.print(numbers[i][j] + " ");
            
            if(numbers[i][j] > highest) {
               highest = numbers[i][j];
            }
         }
         System.out.println();
      }
      
      System.out.println("The highest number is: " + highest);
   
   }
}