package ProgrammingForTT;
import java .util.Scanner;
public class areaTri {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int b = sc.nextInt();
        int h  = sc.nextInt();

        float a = (0.5f * b * h);
        double ar = 0.5 * b * h;
        System.out.println("Area is : " + a + " " +ar);


    }



}
