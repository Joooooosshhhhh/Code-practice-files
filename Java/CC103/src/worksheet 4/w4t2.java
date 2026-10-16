public class w4t2 {
   public static void main (String[] args){
      int [][] attendance = {
            {1, 1, 0, 1, 1, 0, 0},
            {1, 1, 1, 1, 1, 1, 1},
            {1, 0, 0, 1, 0, 0, 0},
            {1, 1, 1, 1, 1, 1, 1},
            {1, 0, 0, 0, 1, 0, 1}
        };
        
        int count = 0;
        
        for (int i = 0; i < attendance.length; i++) {
         count = 0;
         System.out.print("Student " + (i + 1) + " : ");
        
         for (int j = 0; j < attendance[i].length; j++){
            System.out.print(attendance[i][j] + " ");
            
            if (attendance[i][j] == 0){
               count++;
            }
            
         }
         System.out.print(" | ");
         System.out.print(count);
         System.out.print(" | ");
         if (count == 0)
        
         System.out.print(" perfect attendance");
         
         System.out.println();
         
        }

   

   }

}