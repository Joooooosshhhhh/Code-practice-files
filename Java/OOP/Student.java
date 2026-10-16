public class Student extends Person {

   double gpa;
   
   Student(String first, String last, double gpa) {
      super(first, last);
      this.gpa = gpa;
   }
   
   void showGrade() {
      System.out.println(this.first + " " + this.last + ", " + this.gpa);
   }
}