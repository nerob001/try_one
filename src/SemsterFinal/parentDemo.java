package SemsterFinal;
class parent{

    static void show(){
        System.out.println("parent static method");
    }
}

class child extends parent{

    static void show(){
        System.out.println("child static method");
    }
}
public class parentDemo {
    public static void main(String[] args) {

        parent o1 = new child();
        o1.show();

        child o2 = new child();
        o2.show();
    }
}
