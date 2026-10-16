public class MovieTheaterSeating {
   public static void main (String[] args) {
      int [][] theater = { 
         {1, 1, 0, 1, 1, 0}, 
         {1, 1, 1, 1, 0, 1}, 
         {1, 0, 0, 1, 1, 0}, 
         {1, 1, 1, 0, 1, 1}, 
         {1, 0, 0, 1, 1, 0} 
      };
      
      getSeat(theater);
      
   }
   
   public static void getSeat (int[][] theater) {
      
      int occupiedSeat = 0;
      
      for (int i = 0; i < theater.length; i++) {
         
         occupiedSeat = 0;
         System.out.print("Row " + (i + 1) + ": ");
      
         for(int j = 0; j < theater[i].length; j++) {
            System.out.print(theater[i][j] + " ");
            
            if (theater[i][j] == 1) {
             occupiedSeat++;
            }       
         }
         
         System.out.print( " | occupied seat: " + occupiedSeat);
         System.out.println();
      } 
   }
}`