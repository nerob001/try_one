package ProgrammingForTT;
import java.util.Scanner;
public class GadeSWc {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        n /= 10;

        switch(n){

            case 10:
            case 9:
            case 8 :
                System.out.println("A+");
                break;

            case 7 :
                System.out.println("A");
                break;

            case 6 :
                System.out.println("A-");
                break;

            case 5:
            case 4:
                System.out.println("B");
                break;

            default :
                System.out.println("F");
        }
    }
}
