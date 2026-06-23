package SemsterFinal;
class Test{

    int a,b;
    Test(int a,int b){
        this.a=a;
        this.b=b;

    }

    Test(Test o){

        a = o.a;
        b = o.b;

    }

    Test incre(){

        Test temp = new Test(a+10,b+5) ;
        return temp;

    }

    void change(Test o){

        o.a = 56;
        o.b = 90;

    }

    boolean equalTo(Test obj){

        if(obj.a == a && obj.b == b) return true;
        else return false;

    }
}
public class TestDemo {
    public static void main(String[] args) {

        Test obj1 = new Test(1,2);
        Test obj2 = new Test(3,4);
        Test obj3 = new Test(1,2);

        System.out.println(obj1.equalTo(obj2));
        System.out.println(obj3.equalTo(obj1));

        Test o4 = new Test(obj2);
        System.out.println(o4.a + " " + o4.b);
        o4.incre();
        System.out.println(o4.a + " " + o4.b);
        Test o5 = o4.incre();
        System.out.println(o5.a + " " + o5.b);
        obj3.change(obj3);
        System.out.println(obj3.a + " " + obj3.b);

    }
}
