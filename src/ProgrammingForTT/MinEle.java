package ProgrammingForTT;

import java.util.Scanner;

public class MinEle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] a = new int[n];

        for(int i = 0;i<n;i++){

            a[i] = sc.nextInt();

        }

        int mn = Integer.MAX_VALUE;

        for(int i = 0;i<n;i++){

            mn = Math.min(a[i],mn);

        }

        System.out.println(mn);
    }
}
