public class problem2 {
   public static void main(String[] args) {
      
      int[][] theater = {
         {1, 1, 0, 1, 1, 0},
         {1, 1, 1, 1, 0, 1},
         {1, 0, 0, 1, 1, 0},
         {1, 1, 1, 0 ,1 ,1},
         {1, 0, 0, 1, 1, 0},
      };
      
      int occupied = 0;
      for (int i = 0; i < theater.length; i++) {
         
         occupied = 0;
         
         System.out.print("Row " + (i + 1) + " : ");
         
         for(int j = 0; j < theater[i].length; j++) {
            System.out.print(theater[i][j] + " ");
            
            if (theater[i][j] == 1) {
               occupied++;
            }
         }
         
         System.out.print(" | Occupied Seat: " + occupied);
         System.out.println();
      }
      
   }
}