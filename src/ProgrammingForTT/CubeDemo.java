package ProgrammingForTT;
class Cube{

    int h;
    int w;
    int b;

    Cube(){

        System.out.println("HI I am non-parameterized constructor");

    }

    Cube(int h,int w,int b){
        this.h = h ;
        this.w = w;
        this.b = b;
        System.out.println("HI I am parameterized constructor");

    }

    public void  volume(){

        int vol = h*w*b;
        System.out.println("Volume : "  + vol);

    }


}
public class CubeDemo {

    public static void main(String[] args) {

//        Cube b1 = new Cube();
//        b1.h = 10;
//        b1.w = 5;
//        b1.b = 3;
//        b1.volume();
//        Cube b2 = new Cube();
//        b2.h = 100;
//        b2.w = 50;
//        b2.b = 30;
//        b2.volume();
//        Cube b3 = b2;
//        b3.volume();

        Cube c1 = new Cube();
        Cube c2 = new Cube(1,2,3);
        Cube c3 = new Cube(110,22,3);
        c2.volume();
        c3.volume();


    }
}
