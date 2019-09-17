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

public class TestScoresAndGrade {
    
    public static void main( String [ ] args ) {
        
        // Create a scanner object
        Scanner scanner = new Scanner(System.in);
        double score1;
        double score2;
        double score3;
        double average; 
        
        System.out.println(" Please enter the first score");
        score1 = scanner.nextDouble();
        
        System.out.println(" Please enter the second score");
        score2 = scanner.nextDouble();
        
        System.out.println(" Please enter the third score");
        score3 = scanner.nextDouble();
        
       average = ( score1 + score2 + score3 ) / 3;
       
       if( average < 60 ){
           System.out.printf(" The average score is %f , Thats a grade F" , average );
           
       } else if ( average < 70){
           
            System.out.printf(" The average score is %f , Thats a grade D" , average );
       } else if ( average < 80){
           
            System.out.printf(" The average score is %f , Thats a grade C" , average );
       } else if ( average < 90 ){
           
            System.out.printf(" The average score is %f , Thats a grade B" , average );
       
       } else if ( average <= 100 ){
           
            System.out.printf(" The average score is %f , Thats a grade A" , average );
      
       } 
        
        
    }
}
