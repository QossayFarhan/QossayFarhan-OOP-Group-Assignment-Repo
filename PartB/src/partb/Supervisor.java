
package partb;


public class Supervisor extends Manager {

    public double Allowance = 300.00; 
    public double PriceHour = 15.39 ; 
    public double ExtraBonus; 


    public void ExtraBonus(){
        if (this.Late == false){
            if (this.week1 > 60)
                this.ExtraBonus += 150;
            if (this.week2 > 60)
                this.ExtraBonus += 150;
            if (this.week3 > 60)
                this.ExtraBonus += 150;
            if (this.week4 > 60)
                this.ExtraBonus += 150;
        }
    }
    
    @Override
    public void GrossPay(){
        this.GrossPay1 = this.Allowance + this.MonthPrice + this.MonthlyReward + this.ExtraBonus; 
    }
}


