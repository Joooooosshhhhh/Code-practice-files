public class EmployeeSalaryRecords {
   public static void main(String[] args) {
      int [][] salary = { 
         {22000, 25989, 23090}, 
         {23000, 23576, 23767}, 
         {24000, 24789, 24509}, 
         {25000, 24020, 24567}   
         };
     
      getSalary(salary);
   
   }
   
   public static void getSalary(int[][] salary) {
      
      int total = 0;
      int highestSalary = 0;
      int highestSalaryEmployee = 1;
      
      for (int i = 0; i < salary.length; i++) {
      
         total = 0;
         
      
         System.out.print("Employee " + (i + 1) + " : ");
         
         for (int j = 0; j < salary[i].length; j++) {
         
            System.out.print(salary[i][j] + " ");
            total = total + salary[i][j];
            

         }
         
           if (total > highestSalary) {
               highestSalary = total;
               highestSalaryEmployee = i + 1;
            }
         
         System.out.print("| Salary = " + total);
         System.out.println();
      }
       System.out.println("The employee with highest salary is: " + highestSalaryEmployee + " with a salary of: " + highestSalary);
     
   }
}