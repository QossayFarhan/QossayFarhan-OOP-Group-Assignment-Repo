package javaapplication4;

/**
 * Diamond printing
 *
 * @SITI SALHAH BINTI SUZALI - B05210001
 * @version 1.x
 */
import javax.swing.JOptionPane;
import java.lang.Math;

public class JavaApplication4 {

    public static void main(String[] args) {
        int RowsNumber = 5, Columns, Rows, EmptyCount = 1, output, Number = 0, Warning = 0;
        String input;
        char rep = 'n';

        while (true) {
            Runtime runtime = Runtime.getRuntime();

            //This group of code gets input from the user, it also check for invalid character
            EmptyCount = RowsNumber - 1;
            do {
                input = JOptionPane.showInputDialog(null, "Please enter 0 0r 1 or 2 ONLY", "Input", JOptionPane.QUESTION_MESSAGE);
                if (input == null) {//This group of code ask the user if they want to exit the code if they press cancel
                    int a02 = JOptionPane.showConfirmDialog(null, "Are You Sure You Want To Exit?", "Please Choose", JOptionPane.YES_NO_OPTION);
                    if (a02 == 0) {
                        System.exit(0);
                    } else {
                        rep = 'y';
                    }
                }
                try {
                    Number = Integer.parseInt(input);
                    rep = 'n';

                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "INPUT IS INVALID, PLEASE TRY AGAIN!", "ERROR", JOptionPane.ERROR_MESSAGE);
                    Warning++;
                    rep = 'y';
                }

            } while (rep == 'y');

            //This group of code prints out a diamond shape set of numbers based on what the user input
            if (Number >= 0 && Number <= 2) {
                for (Rows = 1; Rows <= RowsNumber; Rows++) {
                    for (Columns = 1; Columns <= EmptyCount; Columns++) {
                        System.out.print(" ");
                    }
                    EmptyCount--;
                    output = Number * (Rows - 1);
                    for (Columns = 1; Columns <= 2 * Rows - 1; Columns++) {
                        System.out.print(Math.abs(output));
                        output -= Number;
                    }
                    System.out.println();
                }
                EmptyCount = 1;
                for (Rows = 1; Rows <= RowsNumber; Rows++) {
                    for (Columns = 1; Columns <= EmptyCount; Columns++) {
                        System.out.print(" ");
                    }
                    EmptyCount++;
                    output = Number * ((RowsNumber - Rows) - 1);
                    for (Columns = 1; Columns <= 2 * (RowsNumber - Rows) - 1; Columns++) {
                        System.out.print(Math.abs(output));
                        output -= Number;
                    }
                    System.out.println();
                }
                break;
            } else {
                JOptionPane.showMessageDialog(null, "Your input is not correct please enter again!", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}
