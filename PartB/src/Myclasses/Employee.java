package Myclasses;

public class Employee {

    public String Department;
    public int StaffNO;
    public String Name;
    public String ID;
    public String Position;
    public boolean FullTime;
    public double PriceHour;
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
    public double MonthlyReward;
    public String LessHoursReason1;
    public String LessHoursReason2;
    public String LessHoursReason3;
    public String LessHoursReason4;
    public double IncomeTax;
    public double EPF;
    public double SOCSO;
    public double TotalDeduction;
    public double NetPay;
    //for son class
    public double ExtraBonus;

    public void SetPrice() {
    }

    public void GenerateID(int id) {
        this.ID = "UM" + this.Position.charAt(0) + String.format("%04d", id);
    }

    public String PriceWeek(int weekhours, String LessHoursReason) {
        String WeekPrice;
        if ("Not Given".equals(LessHoursReason)) {
            WeekPrice = "Incomplete";
        } else {
            double weekPay = this.PriceHour * weekhours;
            WeekPrice = "RM" + String.format("%.2f", weekPay);
        }
        return WeekPrice;
    }

    public void TotalWorkHours() {
        if (!"n".equals(this.LessHoursReason1)) {
            this.TotalWorkHours += this.week1;
        }
        if (!"n".equals(this.LessHoursReason2)) {
            this.TotalWorkHours += this.week2;
        }
        if (!"n".equals(this.LessHoursReason3)) {
            this.TotalWorkHours += this.week3;
        }
        if (!"n".equals(this.LessHoursReason4)) {
            this.TotalWorkHours += this.week4;
        }
    }

    public void PriceMonth() {
        this.MonthPrice = this.TotalWorkHours * this.PriceHour;
    }

    public void LateDaysPen() {
        if (this.Late) {
            this.LateDayPen = this.LateDays * 30;
        }
    }

    public void GrossPay() {
        if (this.FullTime == true){
            this.GrossPay1 = this.Allowance + this.MonthPrice + this.MonthlyReward;
        }
        else
            this.GrossPay1 = this.MonthPrice;
    }

    public void GrossPayAfter() {

        this.GrossPayAfter = this.GrossPay1 - this.LateDayPen;
    }
    

    public void MonthlyReward() {
        if (this.FullTime == true){
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
    }

    

    public void EPF() {
        if (this.FullTime == true){
            this.EPF = this.GrossPayAfter * 0.11;
        }
    }

    public void SOCSO() {
        if (this.FullTime == true){
           this.SOCSO = this.GrossPayAfter * 0.05;  
        }
    }

    public void IncomeTax() {
        if (this.FullTime == true){
            if (this.GrossPayAfter > 2500){
           this.IncomeTax = this.GrossPayAfter * 0.03; 
        }
        else {
            this.IncomeTax = 0; 
        }
        }
    }

    public void TotalDeduction() {
        if (this.FullTime == true){
            this.TotalDeduction = this.EPF + this.IncomeTax +this.SOCSO;
        }
    }

    public void NetPay() {
        this.NetPay = this.GrossPayAfter - this.TotalDeduction;
    }

    public void ExtraBonus() {
    }

}
