package ProgrammingForTT;

import java.util.Scanner;

public class Scenario {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double sales = sc.nextDouble();
        double att = sc.nextDouble();

        if(sales>=90){

            if(att == 100){

                System.out.println("60% bonus");

            }

            else if(att>=90){

                System.out.println("40% bonus");

            }

            else{

                System.out.println("5% bonus");

            }

        }

        else if(sales>=80){

            if(att == 100){

                System.out.println("40% bonus");

            }

            else if(att>=90){

                System.out.println("20% bonus");

            }

            else{

                System.out.println("5% bonus");

            }

        }

        else{

            System.out.println("5% bonus");

        }


    }
}
