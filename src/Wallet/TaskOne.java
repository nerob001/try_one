package Wallet;

public class TaskOne {

    public static class Account{

        int balance;


        Account(int balance){

            this.balance = balance;


        }

        public int deposit(int balance,int amount){

            this.balance += amount;

            return this.balance;


        }

        public int withdraw(int balance,int amount){

            this.balance -= amount;

            return this.balance;

        }
    }

    public static void main(String[] args) {

        Account a1 = new Account(10000);
        System.out.println(a1.deposit(10000,100));
        System.out.println(a1.withdraw(10000,500));

        Account a2 = new Account(500);
        System.out.println(a2.withdraw(500,100));
        System.out.println(a2.deposit(500,100));

    }
}
