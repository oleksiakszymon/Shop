package products.categories;

import products.Product;

public class Fruits extends Product {

    double weight;

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Fruits(String name, double price, double weight){
        super(name, price);
        this.weight = weight;
    }
}
