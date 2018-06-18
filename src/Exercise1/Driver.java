package Exercise1;

import javax.swing.*;

public class Driver {

    public static void main(String[] args) {

        Insurance[] policies = new Insurance[5];

        for(int i = 0; i < policies.length; i++){

            int selection = JOptionPane.showOptionDialog(
                    null,
                    "Select Insurance type",
                    "Insuance selection",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.INFORMATION_MESSAGE,
                    null,
                   new Object[]{"Health","Life"},
                    "Health");

            double cost = Double.parseDouble(JOptionPane.showInputDialog(null,"Enter monthly cost",JOptionPane.YES_NO_OPTION));

            if( selection == 0){
                Health h = new Health(cost);

                policies[i] = h;
            }else{
                Life l = new Life(cost);
                policies[i] = l;
            }
        }

        System.out.println("Initial array of insurance policies");
        for (Insurance pol: policies) {
            pol.display();
        }

        for (Insurance pol: policies) {
            double newCost = Double.parseDouble(JOptionPane.showInputDialog(null,"Enter new monthly cost",JOptionPane.YES_NO_OPTION));
            pol.setInsuranceCost(newCost);
        }

        System.out.println();
        System.out.println("Update list of insurance Policies");
        for (Insurance pol: policies) {
            pol.display();
        }

    }
}
