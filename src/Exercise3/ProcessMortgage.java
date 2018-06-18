package Exercise3;

import javax.swing.*;

public class ProcessMortgage {
    public static void main(String[] args) {

        //mortgage array
        Mortgage[] mortgages = new Mortgage[3];

        for(int i =0; i < mortgages.length; i++){
            double primeInterest = Double.parseDouble(JOptionPane.showInputDialog(null,"Please enter the current prime interest rate:",JOptionPane.YES_NO_OPTION));

            int selection = JOptionPane.showOptionDialog(
                    null,
                    "Select mortgage type",
                    "Mortgage selection",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.INFORMATION_MESSAGE,
                    null,
                    new Object[]{"Personal","Business"},
                    "Personal");

            String name =JOptionPane.showInputDialog(null,"Please enter the customer name:",JOptionPane.YES_NO_OPTION);
            double mortgageAmount = Double.parseDouble(JOptionPane.showInputDialog(null,"Please enter the mortgage amount:",JOptionPane.YES_NO_OPTION));
            int term = Integer.parseInt(JOptionPane.showInputDialog(null,"Please enter the term of the mortgage:",JOptionPane.YES_NO_OPTION));


            if(selection == 0){
                try {
                    mortgages[i] = new PersonalMortgage(name, mortgageAmount, term, primeInterest);
                    JOptionPane.showMessageDialog(null,"Your personal mortgage was created successfully with " + mortgages[i].bankName);
                }catch (Exception e){
                    JOptionPane.showMessageDialog(null,"Your personal mortgage could not be created successfully.");
                }
            }else{
                try {
                    mortgages[i] = new BusinessMortgage(name, mortgageAmount, term, primeInterest);
                    JOptionPane.showMessageDialog(null,"Your business mortgage was created successfully with " + mortgages[i].bankName);
                }catch (Exception e){
                    JOptionPane.showMessageDialog(null,"Your business mortgage could not be created successfully.");
                }
            }


        }

        //display mortgages
        for(int i =0; i < mortgages.length; i++){
            mortgages[i].getMortgageInfo();
        }

    }
}
