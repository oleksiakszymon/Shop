package products;

import java.util.ArrayList;

public class Shop {

    public ArrayList<Product> productsList ;

    public Shop() {
        this.productsList = new ArrayList<>();
    }

    public void createProductsList(){

    productsList.add(new Product("Bread", 2.99, 5));
    productsList.add(new Product("Milk", 3.99, 15));
    productsList.add(new Product("Butter", 8.99, 13));
    productsList.add(new Product("Egg", 0.65, 60));
    productsList.add(new Product("Sugar", 2.50, 20));
    productsList.add(new Product("Chicken", 13.99, 3));
    productsList.add(new Product("Mayonnaise", 6.99, 20));
    productsList.add(new Product("Cola", 4.99, 40));
    productsList.add(new Product("Yoghurt", 2.99, 3));

    }
    public void showProductList() {
        int i = 0;
        for (Product e : productsList) {
            i++;
            System.out.print(i + " " + e.name + " - ");
            System.out.print("Price: " + e.price + "$, ");
            System.out.print("In stock: " + e.amount + "\n");
        }
        System.out.println();
    }
}
