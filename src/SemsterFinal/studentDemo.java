package SemsterFinal;

public class studentDemo {

    String name;
    int age;

    studentDemo(){

        name = "Unknown";
        age = 0;


    }

    studentDemo(String name){
        this.name=name;

    }

    studentDemo(String name,int age){
        this.name=name;
        this.age=age;

    }

    void display(){
        System.out.println("Name:"+name);
        System.out.println("Age:"+age);

    }

    public static void main(String[] args){
        studentDemo obj = new studentDemo();
        obj.display();

        studentDemo obj1 = new studentDemo("Naruto");
        obj1.display();

        studentDemo obj2 = new studentDemo("Naruto",18);
        obj2.display();

    }
}
