package codeWithHarry;
import java .util.Scanner;
public class SwCas {
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        switch(age){

            case 18:

                System.out.println("you are adult");
                break;

            case 21 :

                System.out.println("you must have a job");
                break;

            case 60 :

                System.out.println("you  must be retire");
                break;

            default:

                System.out.println("you are free");

        }
    }
}
