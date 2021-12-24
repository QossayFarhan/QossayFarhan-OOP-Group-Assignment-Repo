
package Myclasses;

public class Promoter extends Employee { 
    public double PriceHour = 8.89 ; 
    
    public Promoter(String Department, int StaffNO , int ID, String Name ,String Position, boolean FullTime){
         this.Department = Department; 
        this.StaffNO = StaffNO;
        this.GenerateID(ID);
        this.Name = Name; 
        this.Position = Position; 
        this.FullTime = FullTime;
    }
}
