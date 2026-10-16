public class QuizScoresAnalysis {
   public static void main(String[] args) {
     int [][] quizscore = { 
         {13, 17, 25}, 
         {12, 20, 50}, 
         {15, 20, 50}, 
         {10, 10, 20}, 
         {15, 18, 31}     
     };
     
   displayEach(quizscore);  
   }
   
   public static void displayEach(int[][] quizscore) {
      
      int total = 0;
      double avg = 0;
      int lowest = quizscore[0][0] + quizscore[0][1] + quizscore[0][2];
      
      for (int i = 0; i < quizscore.length; i++) {
         total = 0;
         System.out.print("Student " + (i + 1) + " : ");
         
         for (int j = 0; j < quizscore[i].length; j++) {
            System.out.print(quizscore[i][j] + " ");
            
            total = total + quizscore[i][j];
            avg = (double) total / 3;
         }
         if (lowest > total) {
            lowest = total;
         }
         
         System.out.println(" | average: " + avg);
         System.out.println();
      }
      
      System.out.println("Lowest total score is: " + lowest);
      
   }
}