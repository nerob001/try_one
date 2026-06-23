package ProgrammingForTT;
import java.util.Scanner;
public class Methods {

    static int fun(int n){

        return n*n;

    }

    static int fun(int a,int b){

        return a*b;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fun(n));
        System.out.println(fun(2,3));

    }
}
