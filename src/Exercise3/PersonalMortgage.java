package Exercise3;

public class PersonalMortgage extends Mortgage {
    public PersonalMortgage(String customerName, double mortgageAmount, int term, double interestRate) throws Exception {
        super(customerName, mortgageAmount, term);
        this.interestRate = interestRate + 2;
    }
}
