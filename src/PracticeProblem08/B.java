package PracticeProblem08;

class Restaurant{

    double foodPrice;

    Restaurant(double foodPrice){

        this.foodPrice = foodPrice;

    }

    double calculateTotalBill(){

        return foodPrice + (foodPrice * 0.10);

    }

    int estimateDeliveryTime(){

        return 40;

    }

}

class FastFoodRestaurant extends Restaurant{

    FastFoodRestaurant(double foodPrice){

        super(foodPrice);

    }

    @Override
    double calculateTotalBill(){

        return foodPrice + (foodPrice * 0.15);

    }

    @Override
    int estimateDeliveryTime(){

        return 20;

    }

}

class FineDiningRestaurant extends Restaurant{

    FineDiningRestaurant(double foodPrice){

        super(foodPrice);

    }

    @Override
    int estimateDeliveryTime(){

        return 60;

    }

}

public class B {
    public static void main(String[] args){

        Restaurant r1 = new FastFoodRestaurant(1000);
        Restaurant r2 = new FineDiningRestaurant(1000);

        System.out.println("Fast Food Restaurant");
        System.out.println("Total Bill: " + r1.calculateTotalBill());
        System.out.println("Delivery Time: " + r1.estimateDeliveryTime() + " mins");

        System.out.println();

        System.out.println("Fine Dining Restaurant");
        System.out.println("Total Bill: " + r2.calculateTotalBill());
        System.out.println("Delivery Time: " + r2.estimateDeliveryTime() + " mins");

    }

}
