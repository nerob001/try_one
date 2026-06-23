package WantTOLearnOOPS;

public class CarClass {

    public static class Car{

        String name;
        String model;
        int price;

        Car(String name,String model,int price){

            this.name = name;
            this.model = model;
            this.price = price;

        }

        public void GetInfo(){

            System.out.println("name : " + name);
            System.out.println("model : " + model);
            System.out.println("price : " + price);

        }

    }

   public static void main(String[] args) {

        Car c1 = new Car("Audi","Speedy",230000);
        c1.name = "Lamborgini";
        Car c2 = new Car("Buguti","Speedy",5600000);

        c1.GetInfo();
        c2.GetInfo();

    }

}
