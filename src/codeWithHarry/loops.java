package codeWithHarry;
import java .util.Scanner;
public class loops {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int num = sc.nextInt();

        int i = 100;

        while(i<=num){

            System.out.println(i);
            i++;

        }

    }
}
