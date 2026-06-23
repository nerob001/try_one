package ProgrammingForTT;
class Printer{
    public void print(Employee e){

        System.out.println("name : " + e.getName());

    }

}
class Employee{

    private String name;

    public Employee(String name){

        this.name = name;

    }

    public String getName(){

        return this.name;

    }

    public void printDetails(){

        Printer p1 = new Printer();
        p1.print(this);

    }
}
public class javaThisKeyword {
    public static void main(String[] args) {

        Employee e1 = new Employee("John");
        System.out.println(e1.getName());
        Printer p1 = new Printer();
        p1.print(e1);

    }
}
