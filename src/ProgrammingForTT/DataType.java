package ProgrammingForTT;
import java .util.Scanner;
public class DataType {
    public static void main(String[] args) {

        byte age = 90;
        int bal = 345000;
        final float pi = 3.1415f;
        double d = 4.56689;
        char ch = 'A';
        long z = 677996565669L;
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(s);
        System.out.println(age + " " + bal +  " " + pi + " " + d + " " + ch + " " + z);
    }
}
