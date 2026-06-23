package ProgrammingForTT;
import java . util . Scanner;
public class AreaCircle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        float pi = 3.1415f;
        char ch = sc.next().charAt(0);

        float a = pi * r * r;
        System.out.println("Area of circle is : " + a);

    }
}
