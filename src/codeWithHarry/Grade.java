package codeWithHarry;
import java.util.Scanner;
public class Grade {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter sub1 : ");
        int a = sc.nextInt();
        System.out.println("Enter sub2 : ");
        int b = sc.nextInt();
        System.out.println("Enter sub3 : ");
        int c = sc.nextInt();
        System.out.println("Enter sub4 : ");
        int d = sc.nextInt();
        System.out.println("Enter sub5 : ");
        int e = sc.nextInt();

        int total = a+b+c+d+e;
        System.out.println(total);

        float percentage = total/5.0f;
        System.out.println(percentage);



    }
}
