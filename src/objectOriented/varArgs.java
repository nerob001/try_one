package objectOriented;

public class varArgs {

    static int fun(int ... arr){

        int sum = 0;

        for(int val : arr){

            sum += val;

        }

        return sum;

    }


    public static void main(String[] args) {

        System.out.println(fun());
        System.out.println(fun(1));
        System.out.println(fun(1, 2));
        System.out.println(fun(1, 2, 3));
        System.out.println(fun(1, 2, 3, 4));

    }

}
