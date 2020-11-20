package products.categories;

import products.Product;

public class Fruits extends Product {

    double weight;
    double pricePerKg;

    public Fruits() {

    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
        this.price = pricePerKg * weight;
    }

    public double getPricePerKg() {
        return pricePerKg;
    }

    public void setPricePerKg(double pricePerKg) {
        this.pricePerKg = pricePerKg;
    }

    public Fruits(String name, double price, double pricePerKg, double weight){
        super(name, price);
        this.weight = weight;
        this.pricePerKg = pricePerKg;
    }
    @Override
    public double getPrice() {
        return price * weight;
    }
}
