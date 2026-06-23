package ProgrammingForTT;
import java.util.Scanner;
public class medal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter grade : ");
        float grade  = sc.nextFloat();
        System.out.println("Enter true or false : ");
        boolean com = sc.nextBoolean();

        if(com){

            if(grade>=3.5){

                System.out.println("Medalist");

            }

            else{

                System.out.println("Not Medalist");
            }

        }

        else{

            System.out.println("Not Medalist");
        }

    }
}
