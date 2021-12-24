
package Myclasses;


public class Telemarketer extends Employee{
    public double PriceHour = 5.34;
    
    
    public Telemarketer(String Department, int StaffNO , int ID, String Name ,String Position, boolean FullTime ){
        this.Department = Department; 
        this.StaffNO = StaffNO;
        this.GenerateID(ID);
        this.Name = Name; 
        this.Position = Position; 
        this.FullTime = FullTime;
        
    }
}
