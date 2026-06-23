package ProgrammingForTT;

public class Reverse {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6};

        for(int i = 0;i<arr.length;i++){

            System.out.print(arr[i] + " ");

        }

        int i = 0 , j = arr.length-1;

        while(i<=j){

            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;


        }

        System.out.println();

        for(int k = 0;k<arr.length;k++){

            System.out.print(arr[k] + " ");

        }

    }


}
