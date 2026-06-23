package objectOriented;
class Employee1{

    private int salary;
    private String name;

    public Employee1(){

        System.out.println("i am constructor");

    }

    public Employee1(int salary,String name){

        this.salary=salary;;
        this.name=name;

    }

    public String getName(){

        return name;

    }

    public void setName(String name){

        this.name = name;

    }

    public int getSalary(){

        return salary;

    }

    public void setSalary(int salary){

        this .salary = salary;

    }


}
class Cellphone{

    public void ringing(){

        System.out.println("ringing....");
    }

    public void vibration(){

        System.out.println("vibrating....");
    }

    public void Calling(){

        System.out.println("Calling....");
    }

}

class Square{

    int side;

    public int area(){

        return side * side;

    }

    public int parameter(){

        return 4*side;

    }
}

class Rectangle{

    int length;
    int breadth;

    public int area(){

        return length * breadth;

    }

    public int parameter(){

        return 2*(length + breadth);

    }
}


public class Employee_id {

    public static void main(String[] args) {

        Employee1 E1 = new Employee1();
//        E1 .name = "nerob";
//        System.out.println(E1.name);
//        E1.setName("Itachi Uchiha");
//        E1.setSalary(120000);
        System.out.println(E1.getName());
        System.out.println(E1.getSalary());

//        Cellphone E2 = new Cellphone();
//        E2.ringing();
//        E2.Calling();
//        E2.vibration();

//        Square s1 = new Square();
//        s1.side = 10;
//
//        System.out.println(s1.area());
//        System.out.println(s1.parameter());

//        Rectangle r1 = new Rectangle();
//        r1.length = 5;
//        r1.breadth = 3;
//
//        System.out.println(r1.area());
//       System.out.println(r1.parameter());

    }
}
