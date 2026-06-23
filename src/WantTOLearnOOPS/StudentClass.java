package WantTOLearnOOPS;

public class StudentClass {

    public static void fun(Student x){

        x.name = "Minato";
//        x.roll_no = 1;
        x.percentage = 99.98;

    }


    public static void main(String[] args) {

        Student s1 = new Student("Naruto",80.56);//Declaration
        Student s2 = new Student("Sasuke",90.56);
        Student s3 = new Student("Sakura",91.56);


        System.out.println(Student.GetNumberOfStd());



//        System.out.println("name : " + s1.name);
//        System.out.println("roll_no : " + s1.roll_no);
//        System.out.println("percentage : " + s1.percentage);
//
//        Student s2 = new Student();
//        s2.name = "Naruto";
//        s2.roll_no = 12;
//        s2.percentage = 80.78;
//
//        System.out.println("name : " + s2.name);
//        System.out.println("roll_no : " + s2.roll_no);
//        System.out.println("percentage : " + s2.percentage);

    }
}
