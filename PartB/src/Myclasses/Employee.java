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
        this.GrossPay1 = this.MonthPrice;
    }

    public void GrossPayAfter() {
        this.GrossPayAfter = this.GrossPay1 - this.LateDayPen;
    }

    public void MonthlyReward() {
    }

    public void EPF() {
    }

    public void SOCSO() {
    }

    public void IncomeTax() {
    }

    public void TotalDeduction() {
    }

    public void NetPay() {
        this.NetPay = this.GrossPayAfter - this.TotalDeduction;
    }

    public void ExtraBonus() {
    }

}
