package ProgrammingForTT;
class Person{

    String name;
    int age;
    String phoneNumber;

    public Person(String name,int age){

        this.name = name;
        this.age = age;
        this.phoneNumber = "Not provided";

    }

    public Person(String name,int age,String phoneNumber){

        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;

    }

    public void Display() {

        System.out.println("Name : "+ name);
        System.out.println("Age : " + age);
        System.out.println("Phone Number : " + phoneNumber);

    }

}

public class PersonDemo {
    public static void main(String[] args) {

        Person p1 = new Person("daniel",22);
        p1.Display();
        Person p2 = new Person("James Lee",42,"088945678421");
        p2.Display();

    }
}
