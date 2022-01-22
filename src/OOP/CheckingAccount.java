package OOP;

import OOP.BankAccount;

public class CheckingAccount extends BankAccount {

    private double monthlyFee;

    public void getFee(){

           System.out.println(monthlyFee);
    };

    public void setFee(double value){

        monthlyFee= value;
    };

    public void print(){
        System.out.println("print the customers name");
    };



}
