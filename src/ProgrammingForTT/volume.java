package ProgrammingForTT;

import java.util.Scanner;

public class volume {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int r = sc.nextInt();
        final float pi = 3.1415f;

        float v = 4/3f * pi * r * r;
        System.out.println("volume is : " + v);

    }

}
