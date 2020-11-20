package creator;

import products.Product;
import products.categories.Baking;
import products.categories.Drinks;
import products.categories.Fruits;

import java.util.ArrayList;

public class Shop {

    public ArrayList<Product> productsList ;

    public Shop() {
        this.productsList = new ArrayList<>();
    }

    public void createProductsList(){

        productsList.add(new Baking("Bread", 2.99));
        productsList.add(new Baking("Roll", 0.45));
        productsList.add(new Baking("Donut", 1.99));
        productsList.add(new Drinks("Milk", 2.99, 1));
        productsList.add(new Drinks("Cola", 4.99, 1.75));
        productsList.add(new Drinks("Cola", 3.50, 1));
        productsList.add(new Drinks("Juice", 2.99, 1.5));
        productsList.add(new Fruits("Banana", 5.99, 0));
        productsList.add(new Fruits("Apple", 2.99, 0 ));
        productsList.add(new Fruits("Peach", 6.99, 0 ));

    }
    public Product getByIndex(int index) {
        return productsList.get(index - 1);
    }
    public void showProductList() {
        int i = 0;
        for (Product e : productsList) {
            i++;
            System.out.print(i + " " + e.getName() + " - ");
            System.out.print("Price: " + e.getPrice() + "$ \n");
        }
        System.out.println();
    }
}
