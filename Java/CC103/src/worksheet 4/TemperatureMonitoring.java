public class TemperatureMonitoring {
   public static void main(String[] args) {
      double [][] temperature = { 
         {34.5, 35.4, 33.5, 33.8, 33.9, 33.5, 34.7}, 
         {34.5, 35.4, 38.5, 40.8, 41.9, 35.5, 35.7}, 
         {34.5, 35.4, 37.5, 34.8, 35.9, 37.5, 38.7} 
         };
      
      getEach(temperature);
   }
   
   public static void getEach(double[][] temperature) {
      double sum = 0;
      double highestTemp = 0;
      
      
      for (int i = 0; i < temperature.length; i++) {
         System.out.print("Day " + (i + 1) +": ");
         sum = 0;
      
         for (int j = 0; j < temperature[i].length; j++) {
            System.out.print(" " + temperature[i][j] + " |");
            
            
            sum = (double) sum + temperature[i][j];
            
            if (highestTemp < temperature[i][j]) {
               highestTemp = temperature[i][j];
            }
         }
                    
         System.out.print("| " + sum);
         System.out.println();
      }
      System.out.println("The highest temperature recorded is: " + highestTemp);
   }
}