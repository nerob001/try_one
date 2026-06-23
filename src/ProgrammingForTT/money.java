package ProgrammingForTT;
import java .util.Scanner;
public class money {
    public static boolean check(int n){

        return n == 2 || n == 5 || n == 10 || n == 20 ||
                n == 50 || n == 100 || n == 200 || n == 500 || n == 1000;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();

        System.out.println(check(n));

    }
}
