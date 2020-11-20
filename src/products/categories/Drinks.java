package products.categories;

import products.Product;

public class Drinks extends Product {

    double capacity;

    public Drinks(String name, double price, double capacity) {
        super(name, price);
        this.capacity = capacity;

    }
}
