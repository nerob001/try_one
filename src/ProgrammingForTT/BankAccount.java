package ProgrammingForTT;

public class BankAccount {

     double balance;

    public BankAccount deposite(double balance){

        System.out.println("amount has been deposited ");
        this.balance += balance;
        return this;


    }

    public BankAccount withdraw(double balance){

        System.out.println("amount has been withdrawn ");
        this.balance -= balance;
        return this;

    }

    public void showBalance(){

        System.out.println("Current Balance : " + this.balance);

    }

    public static void main(String[] args) {

        BankAccount a = new BankAccount();
        a.deposite(100).deposite(60).withdraw(40);
        a.showBalance();

        BankAccount b = new BankAccount();
        b.deposite(100);
        b.withdraw(80);
        b.showBalance();

    }

}
