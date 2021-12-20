
package javaapplication4;
/**
 *Diamond printing
 * @SITI SALHAH BINTI SUZALI - B05210001
 * @version 1.x
 */

import javax.swing.JOptionPane;
import java.lang.Math;
public class JavaApplication4 {

public static void main(String[] args) {
int RowsNumber, Columns, Rows, EmptyCount = 1;
RowsNumber = 5;
int output ;

while(true){
EmptyCount = RowsNumber - 1;
String input = JOptionPane.showInputDialog(null, "Please enter 0 0r 1 or 2 ONLY", "Input", JOptionPane.QUESTION_MESSAGE);
int Number = Integer.parseInt(input);

 if (Number >= 0 && Number <= 2 ) {
for (Rows = 1; Rows <= RowsNumber; Rows++)
{
for (Columns = 1; Columns <= EmptyCount; Columns++){
System.out.print(" ");}
EmptyCount--;
output = Number * (Rows - 1);
for (Columns = 1; Columns <= 2 * Rows - 1; Columns++){
System.out.print(Math.abs(output));
output -= Number;
}
System.out.println();
}
EmptyCount = 1;
for (Rows = 1; Rows <= RowsNumber; Rows++)
{
for (Columns = 1; Columns <= EmptyCount; Columns++){
System.out.print(" ");}
EmptyCount++;
output = Number * (Rows - 1);
for (Columns = 1; Columns <= 2 * (RowsNumber - Rows) - 1; Columns++){
System.out.print(Math.abs(output));
output -= Number;
}
System.out.println();
}
break;
}
else {
JOptionPane.showMessageDialog(null, "Your input is not correct please enter again!","ERROR" , JOptionPane.ERROR_MESSAGE);
}
}
}
}