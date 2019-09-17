/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Siebu
 */
import java.util.Scanner;

public class SumOfNumbers {
    public static void main( String [] args ) {
        Scanner scanner = new Scanner( System.in );
        int userNumber = -1;
        int sum = 0;
        
        while( userNumber < 1) {
            System.out.println("Please enter a positive non zero integer");
            userNumber = scanner.nextInt();   
         }
            for( int number = 1; number <= userNumber; number++) {
                sum = sum + number;
                
        }
        System.out.println("The sum of numbers from 1 to" + userNumber + " is " + sum);
        
    }
}
