package objectOriented;
import java .util.Scanner;
public class Question {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //1
//        int sub1 = 100;
//        int sub2 = 89;
//        int sub3 = 70;
//
//        float cgpa = (sub1 + sub2 + sub3) / 30.0f;
//        System.out.println(cgpa);

        //2
//        System.out.println("Enter a string : ");
//        String str = sc.nextLine();
//        System.out.println("hello gd morning " + str + " have a nice day");

        //3
//        char ch = sc.next().charAt(0);
//        System.out.println((char)(ch+8));

        //4
//        System.out.println(sc.hasNextInt());

//        int v= 5;
//        int u = 3;
//        int a = 2;
//        int s = 4;
//
//        float ans = (v*v-u*u)/(2*a*s);
//        System.out.println(ans);

        //5

//        String name = "ITachi UCHiha";
//        name = name .toLowerCase();
//        System.out.println(name);

        //6

//        String name = "how are you";
//        name = name.replace(' ','_');
//        System.out.println(name);

        //7

//        String text = "dear |name| hello ";
//        text = text.replace("|name|","Sasuke");
//        System.out.println(text);

        //8

//        String str = "feel pain accept  pain know pain";
//        System.out.println(str.indexOf("  "));
//        System.out.println(str.indexOf("   "));

        //9

//        float [] marks = {45.6f,56.8f,34.6f,67.8f,99.89f};
//        int n = marks.length;
//
//        float sum = 0.0f;
//
//
//        for(int i = 0;i<n;i++){
//
//            sum += marks[i];
//
//        }

//        System.out.println(sum);

        /*int[]arr = {1,2,7,9,0};
        int num = 10;

        boolean flag = false;

        for(int i = 0;i<arr.length;i++){

            if(arr[i] == num){

                flag = true;
                break;

            }
        }

        if(flag){

            System.out.println("the value is present");

        }

        else{

            System.out.println("the value is not present");
        }

         */

        //11

       /* float [] marks = {45.6f,56.8f,34.6f,67.8f,99.89f};

        float sum = 0.0f;

        for(float val : marks){

            sum += val;

        }

        System.out.println(sum/marks.length);

*/


        /*int[][] m1 = {{1,2,3},{4,5,6}};
        int [][]m2 = {{1,2,3},{4,5,6}};
        int [][] res = {{0,0,0},{0,0,0}};

        for(int i = 0;i<m1.length;i++){
            for(int j = 0;j<m1[i].length;j++){

                res[i][j] = m1[i][j] + m2[i][j];

            }
        }

        for(int i = 0;i<res.length;i++){
            for(int j = 0;j<res[i].length;j++){

                System.out.print(res[i][j] + " ");

            }

            System.out.println();
        }

        */

        /*int[][]m1 = {{1,2,3},
                    {3,4,5}};
        int r1 = m1.length;
        int c1 = m1[0].length;
        int[][]m2 = {{1,2},
                    {3,4},
                    {11,12}};
        int r2 = m2.length;
        int c2 = m2[0].length;
        int [][]res = new int [r1][c2];

        for(int i = 0;i<r1;i++){
            for(int j = 0;j<c2;j++){
                for(int k = 0;k<c1;k++){

                    res[i][j] += m1[i][k] * m2[k][j];

                }
            }
        }

        for(int i = 0;i<r1;i++){
            for(int j = 0;j<c2;j++){

                System.out.print(res[i][j] + " ");

            }

            System.out.println();

        }


         */

        /*int[] arr = {1,2,3,4,5};
        int i = 0 ,j = arr.length-1;

        while(i<=j){

            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;


        }

        for(int val : arr){

            System.out.print(val + " ");
        }


         */

//        int[] arr = {10,2,33,-4,5};
//        int mx = Integer.MIN_VALUE ,mn = Integer.MAX_VALUE;
//
//        for(int i = 1;i<arr.length;i++){
//
//            if(arr[i]>mx){
//
//                mx = arr[i];
//
//            }
//
//            if(arr[i]<mn){
//
//                mn = arr[i];
//
//            }
//
//        }
//
//        System.out.println(mx + " " + mn);

        int[] arr = {10,20,33,40,55};
        boolean flag = true;

        for(int i = 1;i<arr.length-1;i++){

            if(arr[i]>arr[i+1]){

                    flag = false;
                    break;

            }


        }

        if(flag){
//
            System.out.println("Y");

        }

        else{

            System.out.println("N");
        }







    }


}
