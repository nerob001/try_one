package WantTOLearnOOPS;

public class Student {

        String name;
        int roll_no;
        double percentage;
        private static int number_of_Std;

        public Student(String name, double percentage) {

            this.name = name;
            this.percentage = percentage;
            number_of_Std++;
            roll_no = 10;

        }

        public static int GetNumberOfStd(){

            return number_of_Std;

        }

//        public void setRoll_no(int roll){
//
//            roll_no = roll;
//
//        }

//        public int GetRollNo(){
//
//            return roll_no;
//
//        }

        public void GetInfo(){

            System.out.println("name : " + name);
            System.out.println("roll_no : " + roll_no);
            System.out.println("percentage : " + percentage);

        }



}
