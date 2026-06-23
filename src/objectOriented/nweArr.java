package objectOriented;

public class nweArr {

    public static void main(String[] args) {

        int [] marks = new int[5];
        marks[0] = 1;
        marks[1] = 2;
        marks[2] = 3;
        marks[3] = 4;
        marks[4] = 5;

        for(int i = 0;i<5;i++){

            System.out.println(marks[i]);
        }

        String [] brr = {"sasuke","itachi","kisame","shisui","obito"};

        for(String s : brr){
            System.out.println(s);
        }
    }
}
