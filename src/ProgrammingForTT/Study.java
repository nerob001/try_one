package ProgrammingForTT;
class Teacher{

    String name;
    String dept;
    private double salary;


    Teacher(String name,String dept,double salary){

        this.name = name;
        this.dept = dept;
        this.salary = salary;

    }

    public void ChangeDept(String dept){

        this.dept = dept;

    }

    public void Printdetails(){
        System.out.println("Name:"+name);
        System.out.println("Dept:"+dept);
        System.out.println("Salary:"+salary);

    }

    public void setter(double salary){

        this.salary = salary;

    }

    public double getter(){

        return salary;


    }


}
public class Study {
    public static void main(String[] args) {

        Teacher t1 = new Teacher("Itachi","Genjutsu",1234);
        t1.ChangeDept("Ninjutsu");
        t1.Printdetails();
//        t1.setter(12345);
//        System.out.println(t1.getter());;

    }
}
