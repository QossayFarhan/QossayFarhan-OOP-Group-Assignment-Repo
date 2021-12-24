
package Myclasses;

public class Promoter extends Employee {  
    
    public Promoter(String Department, int StaffNO ,String Name ,String Position, boolean FullTime){
        this.Department = Department; 
        this.StaffNO = StaffNO;
        this.Name = Name; 
        this.Position = Position; 
        this.FullTime = FullTime;
    }
    
    @Override
    public void SetPrice(){
    this.PriceHour = 8.89  ;
    }
}
