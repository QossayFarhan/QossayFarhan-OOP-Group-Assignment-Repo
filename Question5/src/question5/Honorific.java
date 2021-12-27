package question5;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class Honorific {

    public static String Desig() {
        JComboBox Name = new JComboBox();
        Name.addItem("Mr.");
        Name.addItem("Mrs.");
        Name.addItem("Ms.");
        JOptionPane.showMessageDialog(null, Name, "How We Should Address You", JOptionPane.QUESTION_MESSAGE);
        String HonorName = (String) Name.getSelectedItem();
        return HonorName;
    }
}
