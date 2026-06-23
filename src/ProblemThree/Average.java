package ProblemThree;
import java.util.Scanner;
public class Average {

    public static void main(MYstring[] args) {

        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        for(int i = 0;i<5;i++){

            arr[i] = sc.nextInt();

        }

        double avg = 0;

        for(int i = 0;i<5;i++){

            avg += arr[i];


        }

        avg /= 5;
        System.out.println(avg);


    }
}
