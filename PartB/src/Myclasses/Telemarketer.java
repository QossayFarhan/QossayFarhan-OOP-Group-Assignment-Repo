
package Myclasses;


public class Telemarketer extends Employee{
    
    
    public Telemarketer(String Department, int StaffNO , int ID, String Name ,String Position, boolean FullTime ){
        this.Department = Department; 
        this.StaffNO = StaffNO;
        this.Name = Name; 
        this.Position = Position; 
        this.FullTime = FullTime;
        
    }
    
    @Override
    public void SetPrice(){
    this.PriceHour = 5.34 ;
    }
}
