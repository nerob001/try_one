package ProgrammingForTT;

import java.util.Scanner;

public class MaxEle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of elements you want to enter: ");
        int n = input.nextInt();

        int [] arr = new int[n];

        for(int i = 0;i<n;i++){

            arr[i] = input.nextInt();

        }

        int mx = Integer.MIN_VALUE;
        int mn = Integer.MAX_VALUE;

        for(int i = 0;i<n;i++){

            mx = Math.max(arr[i],mx);

        }

        System.out.println(mx);

    }
}
