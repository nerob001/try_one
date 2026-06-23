package ProgrammingForTT;

public class missingBreak {

    public static void main(String[] args) {

        for(int i =  0;i<12;i++){

            switch(i){

                case 0 :
                case 1 :
                case 2 :
                case 3 :
                case 4 :

                    System.out.println("less than 5");
                    break;

                case 5 :
                case 6 :
                case 7 :
                case 8 :
                case 9 :

                    System.out.println("greater than 5");
                    break;

                default :

                    System.out.println("equal to 10 or more");

            }
        }
    }
}
