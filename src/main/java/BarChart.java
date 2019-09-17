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
        
public class BarChart {
    public static void main ( String [ ] args ) {
        
        int numberOfStores = 5;
        String userStringInput;
        double storeSales;
        int numberOfHundredDollarDivisions;
        String outputString = "Sales Bar Chart\n";
        
        for ( int store = 1; store <= numberOfStores; store++ ){
            userStringInput = JOptionPane.showInputDialog(" Enter todays sales for store " + store);
            storeSales = Double.parseDouble( userStringInput);
            numberOfHundredDollarDivisions = (int)(storeSales/ 100);
            outputString += " Store" + store + ":";
            for( int printAsterisk = 1; printAsterisk <= numberOfHundredDollarDivisions; printAsterisk++) {
                outputString += "*";
                
            }
            outputString += "\n";
        }
        JOptionPane.showMessageDialog( null, outputString);
        System.exit(0);
    }
    
}
