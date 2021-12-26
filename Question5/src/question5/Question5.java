package question5;

import javax.swing.JOptionPane;

public class Question5 {

    public static void main(String[] args) {
        boolean repeat;
        String name;
        do {
            repeat = false;
            name = JOptionPane.showInputDialog(null, "Please Input Your First Name", "Input", JOptionPane.QUESTION_MESSAGE);
            if (!name.matches("^[a-zA-Z]*$")) {

                JOptionPane.showMessageDialog(null, "Please Input Characters Only", "Error", JOptionPane.ERROR_MESSAGE);
                repeat = true;
            }
        } while (repeat == true);

        String HonorName = Honorific.Desig();

        String dob = DOBPicker.DOB();
        System.out.println(dob);
        
        
        
        
    }

}
