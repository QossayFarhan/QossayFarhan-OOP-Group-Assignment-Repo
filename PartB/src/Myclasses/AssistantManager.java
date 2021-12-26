
package Myclasses;


public class AssistantManager extends Manager{ 
    
    public AssistantManager(String Department, int StaffNO ,String Name ,String Position, boolean FullTime){
       super(Department, StaffNO ,Name , Position, FullTime);
    }
    
    @Override
    public void SetPrice(){
    this.PriceHour = 32.45;
    this.Allowance = 800.00;
    }
   
   
}
