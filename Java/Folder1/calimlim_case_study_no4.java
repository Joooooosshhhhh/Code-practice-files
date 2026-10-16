package Folder1;

import javax.swing.*;

public class calimlim_case_study_no4 {
    public static void main (String[] args) {
        String amount = JOptionPane.showInputDialog(
                null,
                "Positive Number = deposit" +
                        "\n Negative number = withdraw" +
                        "\n You have:  ₱ 20,000.00" +
                        "\n Enter an amount: ",
                "bank",
                JOptionPane.QUESTION_MESSAGE);
        int int_amount = Integer.parseInt(amount);

        if (int_amount < 0 && int_amount >= -20000) {
            int negative = (20000 + int_amount);

            JOptionPane.showMessageDialog ( null,
                    "Your remaining balance is: " + negative,
                    "Savings",
                    JOptionPane.INFORMATION_MESSAGE);
        }

        else if (int_amount >= 1) {
            int positive = (20000 + int_amount);

            JOptionPane.showMessageDialog ( null,
                    "Your remaining balance is: " + positive,
                    "Savings",
                    JOptionPane.INFORMATION_MESSAGE);
        }

        else if (int_amount < -20000) {

            JOptionPane.showMessageDialog ( null,
                    "INSUFFICIENT FUND!",
                    "Savings",
                    JOptionPane.ERROR_MESSAGE);
        }

        else if (int_amount == 0) {
            JOptionPane.showMessageDialog (null,
                    "Program ended"+ "\n Thank you!",
                    "Savings",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }

}

