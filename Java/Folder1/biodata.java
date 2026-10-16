package Folder1;

public class biodata {
   public static void main (String [] args) {
       String complete_name = "Marlon Josh A. Calimlim",
               address = "Tambac, Bayambang, Pangasinan",
               contact_number = "0909 452 9056",
               birthdate = "October 17, 2006",
               birthplace = "Bayambang, Pangasinan",
               Skill1 = "Graphic Design",
               Skill2 = "HTML and CSS experience",
               skill3 = "Python experience",
               skill4 = "Fast learner";

       System.out.println("\t \t Marlon's Biodata");
       System.out.println("==================================");
       System.out.println("Complete Name: " + complete_name);
       System.out.println("Address: " + address);
       System.out.println("Contact Number: "+ contact_number);
       System.out.println("birthdate: " + birthdate);
       System.out.println("birthplace: " + birthplace);
       System.out.println("==================================");
       System.out.println("List of skills: ");
       System.out.print
               ("\t"+ Skill1 +
               "\n" + "\t" + Skill2 +
               "\n" + "\t" +  skill3 +
               "\t" + "\n" +  "\t" + skill4);

   }
}

/*
complete name
address
contact number
birthdate
birthplace
list of skill
separated each by a new line
 */