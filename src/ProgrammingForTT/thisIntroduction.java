package ProgrammingForTT;
class AmbiguousEmployee{

    private String name;
    private int age;

    //Constructor
    public AmbiguousEmployee(String name,int age){

        this.name = name;
        this.age = age;

    }

    public void displayDetails(){

        System.out.println("Name: "+name);
        System.out.println("Age: "+age);

    }

}
public class thisIntroduction {
    public static void main(String[] args) {

        AmbiguousEmployee AE1 = new AmbiguousEmployee("Abir", 10);
        AE1.displayDetails();



    }
}
