package partb;
import javax.swing.JOptionPane;

public class PartB {

   
    public static void main(String[] args) {
        String name;
        String a1 = JOptionPane.showInputDialog(null,"Please input your department name","Input",JOptionPane.QUESTION_MESSAGE);
        name = a1;
        System.out.println(name);
        
        
        String a2 = JOptionPane.showInputDialog(null,"Please input number of staff your department","Input",JOptionPane.QUESTION_MESSAGE);
        int no = Integer.parseInt(a2);
        System.out.println(no);
    }
    
}
