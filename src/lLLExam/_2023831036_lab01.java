// 2023831036
package lLLExam;

class Shop{

    private String name;
    private double Unit_price;
    private int Quantiy_Purchase;

    public Shop(String name,double unit_price,int Quanity_Purchase){
        this.name = name;
        this.Unit_price = unit_price;
        this.Quantiy_Purchase = Quanity_Purchase;

    }

    public double totalPrice(){

        return this.Unit_price*this.Quantiy_Purchase;

    }
    // another additional method
    public void PrintDetails(){

        System.out.println("Name : " + name);
        System.out.println("Unit Price : " + Unit_price);
        System.out.println("Quantiy Purchase : " + Quantiy_Purchase);

    }

    //Also Extra Methods

    public String getName(){

        return this.name;

    }

    public double getUnit_price(){

        return this.Unit_price;

    }

    public int getQuantiy_Purchase(){

        return this.Quantiy_Purchase;

    }


}

public class _2023831036_lab01 {
    public static void main(String[] args) {

        Shop s1 = new Shop("Drinks",10.99,5);
        System.out.println(s1.totalPrice());

        System.out.println("Name : " + s1.getName());
        System.out.println("Unit Price : " + s1.getUnit_price());
        System.out.println("Quantity Purchases : "+s1.getQuantiy_Purchase());

        Shop s2 = new Shop("Chips",6.99,3);
        System.out.println(s2.totalPrice());
        s2.PrintDetails();

    }
}
