package lab1;
import java.util.Scanner;
public class Lab1 {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner myInt = new Scanner(System.in); // This line creates a scanner object
        System.out.print("Enter number between 1 and 5:");
        
        int guess = myInt.nextInt(); // read user input
        if (guess >=1 && guess <=5){
        int result = guess%2; 
        if (result == 0)
        {
            System.out.println("Lucky Guess");
        }else{
            System.out.println("Better Luck Next Time");
        } }else{
            System.out.print("Enter number between 1 and 5:");
            guess = myInt.nextInt();
        }  
    }
}
