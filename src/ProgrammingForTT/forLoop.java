package ProgrammingForTT;

public class forLoop {
    public static void main(String[] args) {

        for(int i = 0;i<10;i++){

            System.out.print(i + " ");

        }

        System.out.println();

        int j = 1;

        while(j<=20){

            if(j%2 == 0){

                System.out.print(j + " ");

            }

            j++;

        }

        System.out.println();

        int k = 1;
        do{

            System.out.print(k + " ");
            k++;

        }while(k<=20);

    }
}
