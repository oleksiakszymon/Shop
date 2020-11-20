package cart;

import products.Product;

import java.util.ArrayList;

public class Cart {

    public ArrayList<Product> cart = new ArrayList<>();
    public static double totalPrice = 0;

    public void addToCart(Product product) {
            Product addedProduct = new Product(product);
            cart.add(addedProduct);
            totalPrice = totalPrice + addedProduct.getPrice();
}

    public void showCart(){
        int i=0;
        for(Product e : cart){
            i++;
            System.out.println(i + ". " + e.getName());
        }
        System.out.println();
    }

    public void removeFromCart(Product product) {
            cart.remove(product);
            totalPrice = totalPrice - product.getPrice();
        }
    }
