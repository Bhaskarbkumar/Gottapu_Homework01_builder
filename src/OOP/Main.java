package OOP;

import OOP.BankAccount;
import OOP.CheckingAccount;


public class Main {

    public static void main(String[] args){

        CheckingAccount C = new CheckingAccount();
        C.getFee();
        C.setFee(25.67);
        C.getFee();
    }
}
