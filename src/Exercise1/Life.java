package Exercise1;

public class Life extends Insurance {

    public Life(double monthlyCost){
        this.insuranceType = "Life";
        this.monthlyCost = monthlyCost;
    }

    @Override
    public void display(){
        System.out.printf("%s insurance with a monthly cost of $%.2f",getInsuranceType(),getMonthlyCost() );
        System.out.println();
    }

    @Override
    public void setInsuranceCost(double newCost){
        super.monthlyCost = newCost;

    }

}
