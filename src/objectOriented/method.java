package objectOriented;

public class method {

    static void fun(){

        System.out.println("whats up !");
    }


      int fun(int x,int y){

        return x+y;

    }

    static int fun(int x,int y,int z){

        return x+y+z;

    }

    public static void main(String[] args) {

//        System.out.println(fun(1,2));
        System.out.println(fun(1,2,3));
        fun();

        //method invocation with object creation
        // also method can be non static
        method obj1 = new method();
        int c= obj1.fun(1,2);
        System.out.println(c);

    }
}
