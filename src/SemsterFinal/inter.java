package SemsterFinal;
interface Engine{

    void startEngine();

}

interface Horn{

    void soundHorn();

}

class Car1 implements Engine,Horn{
    @Override
    public void startEngine() {
        System.out.println("Engine started");

    }
    @Override
    public void soundHorn(){

        System.out.println("Horns sound");

    }
}
public class inter {
    public static void main(String[] args) {
        Car1 car = new Car1();
        car.startEngine();
        car.soundHorn();
    }

}
