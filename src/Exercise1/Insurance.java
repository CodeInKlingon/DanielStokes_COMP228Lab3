package Exercise1;

public abstract class Insurance {
    String insuranceType;
    double monthlyCost;

    //gettters
    public String getInsuranceType() {
        return insuranceType;
    }

    public double getMonthlyCost() {
        return monthlyCost;
    }

    public abstract void setInsuranceCost(double newCost);

    public abstract void display();
}
