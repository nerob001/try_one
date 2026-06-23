package ProgrammingForTT;
import java.util.Scanner;
public class Grade {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n>=80){

            System.out.println("A+");

        }

        else if(n>=70){

            System.out.println("A");

        }

        else if(n>=60){

            System.out.println("A-");

        }

        else if(n>=40){

            System.out.println("B");

        }

        else{

            System.out.println("F");

        }


    }
}
