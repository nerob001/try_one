package SemsterFinal;

import java.util.Scanner;

public class reversearr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int[] arr = new int[n];

        for(int i = 0;i<n;i++){

            System.out.println("Enter " + (i+1) + " number element : ");
            arr[i]=sc.nextInt();

        }

        int i = 0 , j = arr.length - 1;

        while(i<=j){

            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;

        }

        for(int si = 0;si<n;si++){
            System.out.print(arr[si]+" ");

        }
    }
}
