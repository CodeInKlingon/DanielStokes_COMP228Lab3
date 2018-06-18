package Exercise1;

public class Health extends Insurance {

    public Health(double monthlyCost){
        this.insuranceType = "Health";
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
