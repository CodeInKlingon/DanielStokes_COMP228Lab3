package Exercise3;

public class BusinessMortgage extends Mortgage {
    public BusinessMortgage(String customerName, double mortgageAmount, int term, double interestRate) throws Exception {
        super(customerName, mortgageAmount, term);
        this.interestRate = interestRate + 1;
    }
}
