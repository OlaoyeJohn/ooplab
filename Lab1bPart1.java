/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1bpart1;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Lab1bPart1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        char reply = 0;
        do{
        System.out.println("Enter a number between 1 and 5:");
        int guess;
        Scanner sc = new Scanner(System.in);
        guess = sc.nextInt();
        int result = guess%2;
        if (guess >=1 && guess <=5 && result == 0){
            System.out.println("Lucky Guess");
            System.out.println("Would you like to try again? (reply y for YES and n for NO)");
            Scanner rpl = new Scanner(System.in);
           reply = rpl.next().charAt(0);
        }else if (guess >=1 && guess <=5 && result !=0){
            System.out.println("Better luck next time");
            break;
            
        }
        
        else {
            System.out.println("Number should be between 1 and 5");
        }
        }while (reply=='y');
        
        System.out.println("Thanks for using this app");
        
          
    }
    
}
