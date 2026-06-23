package ProgrammingForTT;

import java.util.Scanner;

public class oddEvenPrint {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

//        for(int i = 1;i<=n;i++){
//
//            if(i%2 == 0){
//
//                System.out.print(i+" ");
//
//            }
//        }

//        int i = 1;
//        while(i<=n){
//
//            if(i%2 == 0){
//
//                System.out.print(i+" ");
//
//
//            }
//
//            i++;
//
//        }

//        int j = 1;
//
//        do{
//
//            if(j%2 == 0){
//
//                System.out.print(j + " ");
//
//            }
//
//            j++;
//
//        }while(j<=n);

//        for(int i = 1;i<=n;i++){
//
//            if(i%2 != 0){
//
//                System.out.print(i+ " ");
//
//            }
//        }

//        int j = 1;
//
//        while(j<=n){
//
//            if(j%2 != 0){
//
//                System.out.println(j+ " ");
//
//
//            }
//
//            j++;
//
//        }

        int k = 1;

        do{

            if(k%2 != 0){

                System.out.print(k+" ");

            }

            k++;

        }while(k<=n);

    }
}
