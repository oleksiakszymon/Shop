package main;

import products.Product;
import creator.Shop;
import cart.Cart;
import comunication.Output;
import products.categories.Fruits;
import produtctComparators.ProductNameComparator;
import produtctComparators.ProductPriceComparator;

import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Cart cart = new Cart();
        Shop shop = new Shop();
        Output output = new Output();
        String index;

        shop.createProductsList();

        boolean process = true;

        while(process){

            output.showClientOptions();

            Scanner scan = new Scanner(System.in);
            String number = scan.nextLine();

            switch (Integer.parseInt(number)) {
//Showing products
                case 1 -> {
                    output.sortBy();
                    index = scan.nextLine();
                    switch (Integer.parseInt(index)) {
//Name ascending
                        case 1 -> shop.productsList.sort(new ProductNameComparator());
//Name descending
                        case 2 -> shop.productsList.sort(new ProductNameComparator().reversed());
//Price ascending
                        case 3 -> shop.productsList.sort(new ProductPriceComparator());
//Price descending
                        case 4 -> shop.productsList.sort(new ProductPriceComparator().reversed());
                    }
                    shop.showProductList();
                }
//Adding to cart
                case 2 -> {
                    System.out.println("Which product do you want to add to your cart?");
                    shop.showProductList();
                    index = scan.nextLine();
                    Product chosen = shop.getByIndex(Integer.parseInt(index));
                    if(chosen instanceof Fruits){
                        System.out.println("Insert weight");
                        String input = scan.nextLine();
                        ((Fruits) chosen).setWeight(Double.parseDouble(input));
                    }
                    cart.addToCart(chosen);
                }
// Removing from cart
                case 3 -> {
                    cart.showCart();
                    System.out.println("Which product do you want to remove?");
                    String index1 = scan.nextLine();
                    System.out.println("What amount do you want to remove");
                    cart.removeFromCart(cart.cart.get(Integer.parseInt(index1) - 1));
                }
// Showing cart and summary price
                case 4 -> {
                    cart.showCart();
                    System.out.println("Summary price: " + Cart.totalPrice + "$");
                }
                case 5 -> process = false;
            }
        }
    }
}
