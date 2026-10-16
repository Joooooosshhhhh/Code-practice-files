public class Main {
   public static void main (String[] args) {
     
     Person person = new Person("Marlon Josh", "Calimlim");
     Student student = new Student("Marlon Josh", "Calimlim", 1.35);
     Employee employee = new Employee("Marlon Josh", "Calimlim", 1000000);
     
     person.showName();
     student.showGrade();
     employee.showSalary();
   }
}