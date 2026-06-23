package ProgrammingForTT;

public class ECommerce {

    //Filter by category
    void filerProduct(String Catagory){

        System.out.println("Filtering product by catagories " + Catagory );

    }



    //Filter by price range
    void filerProduct(int minPrice,int maxPrice){

        System.out.println("Filtering product by Price range betwwen " + minPrice + " and " + maxPrice);

    }

     int ReturnVal(int maxPrice){

        return maxPrice;

    }


    //Filter by brand
    void filerProductBrand(String brand){

        System.out.println("Filtering product by brand" + brand);

    }

    //Filter by category and price range
    void filerProduct(String Catagory,int minPrice,int maxPrice){

        System.out.println("Filtering product by catagories " + Catagory + "and also by price range betwwen " + minPrice + "and" + maxPrice);


    }

    //Filter by category and price range
    void filerProduct(String Catagory,int minPrice,int maxPrice,String brand){

        System.out.println("Filtering product by catagories " + Catagory + "and also by price range betwwen " + minPrice + "and" + maxPrice + "again also by brand" + brand);

    }




    public static void main(String[] args) {

        ECommerce shop = new ECommerce();
        shop.filerProduct("Fashion");
        shop.filerProduct(100,500);
        System.out.println(shop.ReturnVal(500));
        shop.filerProductBrand("Apple");
        shop.filerProduct("Electronics",120,700);
        shop.filerProduct("Electronics",120,700,"Nike");

    }
}
