package Exercise3;

public abstract class Mortgage implements iMortgageConstants{

    //gives each new mortgage a unique number
    static int GLOBALMORTGAGENUM = 100000;

    int mortgageNumber;
    String customerName;
    double mortgageAmount;
    double interestRate;
    int term;

    public Mortgage(String customerName, double mortgageAmount, int term) throws Exception {
        mortgageNumber = GLOBALMORTGAGENUM++;
        this.customerName = customerName;

        if (term <= shortTerm){
          this.term = shortTerm;
        } else if( term <= mediumTerm){
            this.term = mediumTerm;
        }else if( term <= longTerm){
            this.term = longTerm;
        }else{
            this.term = shortTerm;
        }

        if (mortgageAmount > maxMortgage) {
            throw new Exception("Mortgage amount too large");
        }
    }


    //displays mortgage details to console window
    public void getMortgageInfo(){
        System.out.printf("Mortgage: %n. Customer: %s. Amount: %f Term: %n Interest Rate: %f",mortgageNumber,customerName,mortgageAmount,term,interestRate);
    }


}
