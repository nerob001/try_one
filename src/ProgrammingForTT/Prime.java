package ProgrammingForTT;

import java.util.Scanner;

public class Prime {

   static  boolean fun(int n){

       if(n<=1){

           return false;

       }

        for(int i = 2;i*i<=n;i++){

            if(n%i == 0){

                return false;

            }
        }

        return true;

    }

    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();

//        int count = 0;
//
//        for(int i = 1;i<=n;i++){
//
//            if(fun(i)){
//
//                count++;
//
//            }
//        }
//
//        System.out.println(count);

        System.out.println(fun(n));


    }


}
