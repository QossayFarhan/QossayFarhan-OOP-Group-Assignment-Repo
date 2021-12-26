
package Myclasses;


public class Executive extends Supervisor {
    
    public Executive(String Department, int StaffNO ,String Name ,String Position, boolean FullTime){
        super(Department, StaffNO ,Name , Position, FullTime);
    }
    
    @Override
    public void SetPrice(){
    this.PriceHour = 12.67;
    this.Allowance = 100.00;
    }
}
