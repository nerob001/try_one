package objectOriented;

public class Practice {
    static void multi(int n){

        for(int i = 1;i<=10;i++){

            System.out.println(n*i + " ");

        }
    }

    public static void main(String[] args) {

        //1
//        multi(7);

        //2

//        int n = 4;
//
//        for(int i = 1;i<=4;i++){
//            for(int j = 1;j<=i;j++){
//
//                System.out.print("* ");
//
//            }
//
//            System.out.println();
//        }

        int m = 4;

        for(int i = 1;i<=4;i++){
            for(int j = 1;j<=m+1-i;j++){

                System.out.print("* ");

            }

            System.out.println();
        }

    }
}
