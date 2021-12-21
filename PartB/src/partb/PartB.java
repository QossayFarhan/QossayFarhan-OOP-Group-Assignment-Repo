package partb;
import javax.swing.JOptionPane;


public class PartB {

   
    public static void main(String[] args) {
        String Name, initials,Dep,a1="",a2="",a3="";
        char rep='n';
        int ID;
        
        String a = JOptionPane.showInputDialog(null,"Please input your Department Name","Input",JOptionPane.QUESTION_MESSAGE);
        String b = JOptionPane.showInputDialog(null,"Please input number of staff your Department","Input",JOptionPane.QUESTION_MESSAGE);
        int NoStaff = Integer.parseInt(b);
        
        for(int i= 1;i<=3;i++){
            switch(i){
                case 1:
                    a1 = JOptionPane.showInputDialog(null,"Please Input Your First Name","Input",JOptionPane.QUESTION_MESSAGE);
                    break;
                case 2:
                    a2 = JOptionPane.showInputDialog(null,"Please Input Your Middle Name","Input",JOptionPane.QUESTION_MESSAGE);
                    break;
                case 3:
                     a3 = JOptionPane.showInputDialog(null,"Please Input Your Last Name","Input",JOptionPane.QUESTION_MESSAGE);
                    break;
            }
        }
        
        do{
            rep='y';
        String c = JOptionPane.showInputDialog(null,"Please input your ID number","Input",JOptionPane.QUESTION_MESSAGE);
        ID = Integer.parseInt(c);
        if(ID > NoStaff){
            JOptionPane.showMessageDialog(null,"ID Number Cannot Be Higher Than Number Of Staff In Department, Please Try Again","Error",JOptionPane.ERROR_MESSAGE);
            rep ='n';
        }
        } while(rep=='n');
      
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        System.out.println("********************UNIMY REMUNERATION SYSTEM********************");
        System.out.println("Department\t\t:"+a);
        System.out.println("Total Staffs\t\t:"+b);
        System.out.println("**********************PAY SLIP - NOV 2021************************");
        System.out.println("Name\t\t\t:"+a1+" "+a2+" "+a3);
        System.out.printf("Staff ID\t\t:%s%s%s%04d\n",a1.charAt(0),a2.charAt(0),a3.charAt(0),ID);
     
        }
    }
    


