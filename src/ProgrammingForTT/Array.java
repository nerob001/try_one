package ProgrammingForTT;
import java .util .Scanner;
public class Array {

    public static void main(String[] args) {

        int[] a1 = {1,2,3,4,5};

        for(int i = 0;i<a1.length;i++){

            System.out.print(a1[i] + " ");

        }

        System.out.println();

//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Enter size : ");
//        int n = sc.nextInt();
//
//        int [] a2 = new int[n];
//
//        for(int i = 0;i<n;i++){
//
//            a2[i] = sc.nextInt();
//
//        }
//
//        for(int i = 0;i<n;i++){
//
//            System.out.print(a2[i] + " ");
//        }
//
//        System.out.println();

        String[][] s1= {{"abc", "as", "asd","awe"},{"ghj","fgt","iop"}};

        for(int i = 0;i<s1.length;i++){
            for(int j = 0;j<s1[i].length;j++){

                System.out.print(s1[i][j] + " ");

            }
            System.out.println();
        }
    }
}
