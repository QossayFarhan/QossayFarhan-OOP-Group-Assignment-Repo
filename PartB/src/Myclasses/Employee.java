
package Myclasses;


public class Employee {
    
    public String Department; 
    public int StaffNO;
    public String Name; 
    public String ID; 
    public String Position; 
    public boolean FullTime; 
    public double PriceHour ; 
    public int week1;
    public int week2;
    public int week3;
    public int week4;
    public int TotalWorkHours; 
    public double MonthPrice; 
    public double GrossPay1;
    public boolean Late; 
    public int LateDays;
    public double LateDayPen;
    public double GrossPayAfter; 
    
    
    
    public void GenerateID(int ID){
            this.ID = "UM"+this.Position.charAt(0)+"00"+ID;
        }

     
    public void PriceWeek(int weekhours){
        double weekPay = this.PriceHour * weekhours; 
        System.out.println(weekPay); 
    }
    
    
    public void TotalWorkHours(){
        this.TotalWorkHours = this.week1 + this.week2+ this.week3 + this.week4; 
    }
    
    
    public void PriceMonth(){
        this.MonthPrice = this.TotalWorkHours * this.PriceHour; 
    }
    
    
    public void LateDaysPen(){
        if (this.Late){
            this.LateDayPen = this.LateDays *  30 ;
        }
    }
    
    
    public void GrossPayAfter(){
        this.GrossPayAfter = this.GrossPay1 - this.LateDayPen; 
    }
}
