
package Myclasses;

public class Manager extends Employee {
    
    public double Allowance = 1000.00; 
    public double PriceHour = 58.85 ; 
    public String MonthlyRewardPercent; 
    public double MonthlyReward ; 
    public boolean LessHoursReason; 
    public double IncomeTax;
    public double EPF; 
    public double SOCSO; 
    public double TotalDeduction; 
    public double NetPay;
    
    
     public Manager(String Department, int StaffNO , int ID, String Name ,String Position, boolean FullTime){
        this.Department = Department; 
        this.StaffNO = StaffNO;
        this.GenerateID(ID);
        this.Name = Name; 
        this.Position = Position; 
        this.FullTime = FullTime;
     }
    
    public void MonthlyReward(){
        if (this.TotalWorkHours < 180 ){
            this.MonthlyReward = 0;
            this.MonthlyRewardPercent = "0%";
        }
        else if (this.TotalWorkHours >= 180){
            this.MonthlyReward = this.GrossPay1 * 0.01;
            this.MonthlyRewardPercent = "1%";
        }
        else if (this.TotalWorkHours >= 220){
            this.MonthlyReward = this.GrossPay1 * 0.03;
            this.MonthlyRewardPercent = "3%";
        }
        else if (this.TotalWorkHours >= 280){
            this.MonthlyReward = this.GrossPay1 * 0.08;
            this.MonthlyRewardPercent = "8%";
        }
    }

    public void GrossPay(){
        this.GrossPay1 = this.Allowance + this.MonthPrice + this.MonthlyReward; 
    }
    
    public void EPF(){
        this.EPF = this.GrossPayAfter * 0.11; 
    }
    
    public void SOCSO(){
        this.SOCSO = this.GrossPayAfter * 0.05; 
    }

    public void IncomeTax(){
        if (this.GrossPayAfter > 2500){
           this.IncomeTax = this.GrossPayAfter * 0.03; 
        }
        else {
            this.IncomeTax = 0; 
        }
    }

    public void TotalDeduction(){
        this.TotalDeduction = this.EPF + this.IncomeTax +this.SOCSO; 
    }
    
    public void NetPay(){
        this.NetPay = this.GrossPayAfter - this.TotalDeduction; 
    }
}
