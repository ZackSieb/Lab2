/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Siebu
 */
import javax.swing.JOptionPane;

public class BankCharges {
    public static void main( String [] args ) {
        
        final double Bank_Base_Fee = 10;
        String userInput;
        int userNumberOfChecks;
        double bankServiceFees;
        String serviceFeeOutput;
        
        userInput = JOptionPane.showInputDialog("How many checks were written for the month?");
        userNumberOfChecks = Integer.parseInt( userInput );
        
        if( userNumberOfChecks < 20){
           bankServiceFees = Bank_Base_Fee + ( userNumberOfChecks * 0.10 ); 
        } else if ( userNumberOfChecks < 40) {
            bankServiceFees = Bank_Base_Fee + ( userNumberOfChecks * 0.08);
        } else if ( userNumberOfChecks < 60 ) {
            bankServiceFees = Bank_Base_Fee + ( userNumberOfChecks * 0.06);   
        } else {
            bankServiceFees = Bank_Base_Fee + ( userNumberOfChecks * 0.04);
        }
       serviceFeeOutput = String.format("Service Fee: $%,.2f ", bankServiceFees );
       JOptionPane.showMessageDialog( null, serviceFeeOutput );
       
       System.exit( 0 );
    }
    
}
