package objectOriented;

public class arr {

    public static void main(String[] args) {
        int [] arr = {1,2,4};
        int n = arr.length;

        System.out.println(n);

        for(int val : arr){

            System.out.print(val + " ");

        }

        System.out.println();

        for(int i = 0;i<n;i++){

            System.out.print(arr[i] + " ");
        }




    }
}
