package SemsterFinal;

import java.util.Scanner;

public class prime {

    static boolean fun(int n){

        if(n<=1){

            return false;

        }

        for(int i = 2;i<=n/2;i++){

            if(n%i == 0){

                return false;

            }
        }

        return true;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(fun(n)){

            System.out.println("Prime Number");

        }

        else{

            System.out.println("Not Prime Number");

        }
    }
}
