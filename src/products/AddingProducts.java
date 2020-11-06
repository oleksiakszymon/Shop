package products;

import java.util.ArrayList;

public class AddingProducts {

    public ArrayList<Product> productsList = new ArrayList<>();

    Product bread = new Product("Bread", 2.99, 5, 0);
    Product milk = new Product("Milk", 3.99, 15, 0);
    Product butter = new Product("Butter", 8.99, 13, 0);
    Product egg = new Product("Egg", 0.65, 60, 0);
    Product sugar = new Product("Sugar", 2.50, 20, 0);
    Product chicken = new Product("Chicken", 13.99, 3, 0);
    Product mayonnaise = new Product("Mayonnaise", 6.99, 20, 0);
    Product cola = new Product("Cola", 4.99, 40, 0);
    Product yoghurt = new Product("Yoghurt", 2.99, 3, 0);

    public void createProductsList(){

    productsList.add(bread);
    productsList.add(milk);
    productsList.add(butter);
    productsList.add(egg);
    productsList.add(sugar);
    productsList.add(chicken);
    productsList.add(mayonnaise);
    productsList.add(cola);
    productsList.add(yoghurt);

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
