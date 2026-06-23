package ProgrammingForTT;

class Student{

    private String name;
    private int rollno;

    public Student(String name){

        this(name,1);

    }

    public Student(String name,int rollno){

        this.name = name;
        this.rollno = rollno;

    }

    public void info(){

        System.out.println("Name: "+name);
        System.out.println("Rollno: "+rollno);

    }


}
public class ConstructorChaining {

    public static void main(String[] args) {

        Student s1 = new Student("hawk");
        s1.info();
    }
}
