package ProgrammingForTT;
class Lamp{

    boolean isOn  = false;

    public void turnOn(){

        isOn = true;

    }

    public void turnOff(){

        isOn = false;

    }

}
public class introduction {

    public static void main(String[] args) {

        Lamp L1 = new Lamp();
        Lamp L2 = new Lamp();

        System.out.println("is on : " + L1.isOn);
        System.out.println("is on : " + L2.isOn);

        L1.turnOn();
        L2.turnOn();

        System.out.println("is on : " + L1.isOn);
        System.out.println("is on : " + L2.isOn);

        L2.turnOff();

        System.out.println("is on : " + L1.isOn);
        System.out.println("is on : " + L2.isOn);

    }
}
