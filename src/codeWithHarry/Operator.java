package codeWithHarry;

public class Operator {
    public static void main(String[] args) {

        System.out.println(45>7);
        System.out.println(5==9);
        System.out.println(45 == 45 && 67>89);
        System.out.println(45 == 45 || 67>89);
        System.out.println(1|0);
        System.out.println(1&0);
        System.out.println(1^0);

        int a = 1;
        int b = 0;
        int c = 0;
        int ans =( b*b - 4*a*c)/(2*a);
        System.out.println(ans);
    }
}
