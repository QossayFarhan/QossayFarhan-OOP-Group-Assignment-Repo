
package Myclasses;


public class Excutive extends Supervisor {
    public double Allowance = 100.00; 
    public double PriceHour = 12.67 ;
    
    
    public Excutive(String Department, int StaffNO , int ID, String Name ,String Position, boolean FullTime){
        super(Department, StaffNO , ID, Name , Position, FullTime);
    }
}
