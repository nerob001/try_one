package objectOriented;
import java .util.Scanner;
public class Percentage {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks of physics : ");
        int phy = sc.nextInt();
        System.out.print("Enter marks of chemistry : ");
        int chem = sc.nextInt();
        System.out.print("Enter marks of math : ");
        int mat = sc.nextInt();
        System.out.print("Enter marks of biology : ");
        int bio = sc.nextInt();
        System.out.print("Enter marks of ict : ");
        int ict = sc.nextInt();

        int total = phy + chem + mat + bio + ict;
        System.out.println(total);
        float avg = total/5.0f;
        System.out.println(avg);


    }
}
