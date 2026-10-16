public class StoreProductSales {
   public static void main(String[] args) {
      int [][] sales = { 
         {1005, 2000, 4000, 4050, 4100}, 
         {2005, 2010, 2050, 2030, 2100}, 
         {3010, 3050, 3100, 3150, 3200}, 
         {4500, 5000, 3000, 4000, 6000} 
      }; 
      
      getEach(sales);
   }
   
   public static void getEach(int [][] sales) {
      int sum = 0;
      int highestSale = 0;
      int day = 1;
       
       for (int i = 0; i < sales.length; i++) {
         System.out.print("Day " + (i + 1) + ": ");
         
         sum = 0;
                  
         for (int j = 0; j< sales[i].length; j++) {
            System.out.print(sales[i][j] + " ");
            
            sum = sum + sales[i][j];
         }
         
         if (sum > highestSale) {
            highestSale = sum;
            day = i + 1;
         }
         
         System.out.print( " | " + sum);
         System.out.println();
      }

      
      System.out.println("The day with highest sale is Day " + day + " with a total number of sales of " + highestSale);
   }
}