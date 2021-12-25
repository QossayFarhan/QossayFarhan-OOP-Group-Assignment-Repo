
package Myclasses;


public class Employee{
    
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
    //for son class
    public double Allowance;  
    public String MonthlyRewardPercent; 
    public double MonthlyReward ; 
    public String LessHoursReason; 
    public double IncomeTax;
    public double EPF; 
    public double SOCSO; 
    public double TotalDeduction; 
    public double NetPay;
    //for son class
    public double ExtraBonus;
    
    public void SetPrice(){}
    
    public void GenerateID(int id){
        this.ID = "UM"+this.Position.charAt(0)+"00"+id; 
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
    
    public void MonthlyReward(){}
    
    public void GrossPay(){}
    
    public void EPF(){}
    
    public void SOCSO(){}
    
    public void IncomeTax(){}
    
    public void TotalDeduction(){}
    
    public void NetPay(){}
    
    public void ExtraBonus(){}
}
