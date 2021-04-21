/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Account;

/**
 *
 * @author Admin
 */
public class classAccount {
    
    // member variable
    public String accountNumber = "1010101010";
    private double balance = 200;
    
    
    //methods
    
    public void setBalance (double balance){
        this.balance = balance;
    }
    
    public double getBalance(){
        return this.balance;
    }
    
    public void showdetails(){
        System.out.println("Account Number "+ this.accountNumber) ;
        System.out.println("Balance is " + this.balance);
    }

    
}
