package OOP;

public class BankAccount {

    private double balance;
    private String name;

    public void  deposit(double value ){

        balance= balance+value;
    };

    public void getBalance(){
        System.out.println(balance);
    };

    public void withdraw( double value){

        balance= balance-value;
    };

    public void print(){

    };






}
