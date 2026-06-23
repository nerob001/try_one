package ProblemThree;

public class MYstring {

    public static void main(String[] args) {

        String[][] str= {

                {"a","b","c","d"},
                {"A","B","C","D"}
        };


        for(String[]row : str){
            for(String s : row){
                System.out.print(s + " ");

            }

            System.out.println();
            
        }
    }


}
