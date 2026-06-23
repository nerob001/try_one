package ProgrammingForTT;
class simpleCal{

    int x;
    int y;
    int res;

    public simpleCal(int x,int y){

        this.x = x;
        this.y = y;

    }

    public void addition(){

        res = x+y;

    }

    public void subtraction() {

        res = x-y;

    }

}
public class Calculator {

    public static void main(String[] args) {

        simpleCal c1 = new simpleCal(10,10);
        simpleCal c2 = new simpleCal(100,10);

        System.out.println(c1.x + " " +c2.x);
        c1.x  = 123;
        c1.addition();
        c2.subtraction();

        System.out.println(c1.res);
        System.out.println(c2.res);

    }




}
