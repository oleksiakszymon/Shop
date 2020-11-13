package cart;

import products.Product;
import products.Shop;

import java.util.ArrayList;

public class Cart {

    public ArrayList<Product> cart = new ArrayList<>();
    public static double totalPrice = 0;

    public void addToCart(Product product, int amount) {
        if(amount > product.amount){
            System.out.println("Not in stock");
        } else {
            Product addedProduct = new Product(product);
            addedProduct.amount = amount;
            cart.add(addedProduct);
            product.amount = product.amount - amount;
            totalPrice = totalPrice + (addedProduct.price * amount);
        }
    // }
//            if(amount > product.amount){
//            System.out.println("Not in stock");
//            } else {
//            Product addedProduct = new Product(product);
//            for (Product e : cart) {
//                if (e.name == addedProduct.name && !cart.isEmpty()) {
//                    int index = cart.indexOf(e);
//                    cart.get(index).amount = cart.get(index).amount + amount;
//                } else {
//                    cart.add(addedProduct);
//                    addedProduct.amount = amount;
//                }
//            }
//            product.amount = product.amount - amount;
//            totalPrice = totalPrice + (addedProduct.price * amount);
//            }
}

    public void showCart(){
        int i=0;
        for(Product e : cart){
            i++;
            System.out.println(i + ". " + e.name + " (" + e.amount + ")");
        }
        System.out.println();
    }

    public void removeFromCart(Product product, int amount) {
        if(amount < product.amount){
            product.amount = product.amount - amount;
            totalPrice = totalPrice - (product.price * amount);
        } else {
            cart.remove(product);
            totalPrice = totalPrice - (product.price * product.amount);
            product.amount = 0;
        }
    }
}
