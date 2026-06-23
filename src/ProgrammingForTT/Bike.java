package ProgrammingForTT;

public class Bike {

    int speed ;
    int numOfGear;
    String bike;

    Bike(int speed,int numOfGear,String bike) {

        this.speed = speed;
        this.numOfGear = numOfGear;
        this.bike = bike;

    }

    void acceleration(){

        System.out.println("accelerating....");

    }

    public static void main(String[] args) {

        Bike hero = new Bike(120,5,"heroX");
        Bike suzuki = new Bike(150,7,"suzukiX");

        System.out.println(hero.speed);
        System.out.println(suzuki.numOfGear);
        suzuki.acceleration();

    }
}
