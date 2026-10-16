public class tryCode {
   public static void main (String[] args) {
      int[][] values = {
         {90, 91, 83, 90},
         {75, 77, 78, 80},
         {90, 91, 92, 93}
      };
   
      int total = 0; 
      int highest = 0;
      
      for (int i = 0; i < values.length; i++) {
         total = 0;
      
         System.out.print("student:" + (i + 1) + ": ");
         for (int j = 0; j < values[i].length; j++) {
            System.out.print(values[i][j] + " ");
            
            total = total + values[i][j];           
         }
         double avg = (double) total / values[i].length;
         System.out.println("average: " + avg);
         
         if (highest < avg) {
            highest = i + 1;
         }
         
         System.out.println();
      }
      System.out.println("highest student is:" + highest);
   }
}