
package Myclasses;

public class Manager extends Employee {

    
    public Manager(String Department, int StaffNO, String Name ,String Position, boolean FullTime){
       this.Department = Department; 
       this.StaffNO = StaffNO;
       this.Name = Name; 
       this.Position = Position; 
       this.FullTime = FullTime;
    }
     
    @Override
    public void SetPrice(){
    this.PriceHour = 58.85 ;
    this.Allowance = 1000.00;
    } 
    
    public void MonthlyReward(){
        if (this.TotalWorkHours < 180 ){
            this.MonthlyReward = 0;
            this.MonthlyRewardPercent = "0%%";
        }
        else if (this.TotalWorkHours >= 180){
            this.MonthlyReward = this.GrossPay1 * 0.01;
            this.MonthlyRewardPercent = "1%%";
        }
        else if (this.TotalWorkHours >= 220){
            this.MonthlyReward = this.GrossPay1 * 0.03;
            this.MonthlyRewardPercent = "3%%";
        }
        else if (this.TotalWorkHours >= 280){
            this.MonthlyReward = this.GrossPay1 * 0.08;
            this.MonthlyRewardPercent = "8%";
        }
    }

    @Override
    public void GrossPay(){
        this.GrossPay1 = this.Allowance + this.MonthPrice + this.MonthlyReward; 
    }
    
    @Override
    public void EPF(){
        this.EPF = this.GrossPayAfter * 0.11; 
    }
    
    @Override
    public void SOCSO(){
        this.SOCSO = this.GrossPayAfter * 0.05; 
    }

    @Override
    public void IncomeTax(){
        if (this.GrossPayAfter > 2500){
           this.IncomeTax = this.GrossPayAfter * 0.03; 
        }
        else {
            this.IncomeTax = 0; 
        }
    }

    @Override
    public void TotalDeduction(){
        this.TotalDeduction = this.EPF + this.IncomeTax +this.SOCSO; 
    }
    
    @Override
    public void NetPay(){
        this.NetPay = this.GrossPayAfter - this.TotalDeduction; 
    }
    
    
}
