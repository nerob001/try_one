package ProgrammingForTT;
class Box{

    double width;
    double height;
    double depth;

    //Constructor
    public Box(double width,double height,double depth){

        this.width = width;
        this.height = height;
        this.depth = depth;

    }

     private double volume(){

        double volume = width * height * depth;
        return volume;

    }

    public double Showvolume(){

        return volume();

    }

}
public class BoxDemo {
    public static void main(String[] args) {

        Box b1 = new Box(10,5,3);
        Box b2 = new Box(1.2,4.5,2.3);
        System.out.println(b1.Showvolume());
        System.out.println(b2.Showvolume());

    }
}
