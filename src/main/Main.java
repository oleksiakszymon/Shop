package main;

import products.Product;
import creator.Shop;
import cart.Cart;
import comunication.Output;
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

        shop.createProductsList();

        boolean process = true;

        while(process){

            output.showClientOptions();

            Scanner scan = new Scanner(System.in);
            String number = scan.nextLine();

            switch (Integer.parseInt(number)) {

                case 1: //Showing products
                    output.sortBy();
                    String index = scan.nextLine();
                    switch(Integer.parseInt(index)){
                        case 1: //Name ascending
                            Collections.sort(shop.productsList, new ProductNameComparator());
                            break;
                        case 2: //Name descending
                            Collections.sort(shop.productsList, new ProductNameComparator().reversed());
                            break;
                        case 3: //Price asending
                            Collections.sort(shop.productsList, new ProductPriceComparator());
                            break;
                        case 4: //Price descending
                            Collections.sort(shop.productsList, new ProductPriceComparator().reversed());
                    }
                    shop.showProductList();
                    break;

                case 2: //Adding to cart
                    System.out.println("Which product do you want to add to your cart?");
                    shop.showProductList();
                    index = scan.nextLine();
                    Product chosen = shop.getByIndex(Integer.parseInt(index));
                    cart.addToCart(chosen);
                    break;
                case 3: // Removing from cart
                    cart.showCart();
                    System.out.println("Which product do you want to remove?");
                    String index1 = scan.nextLine();
                    System.out.println("What amount do you want to remove");
                    cart.removeFromCart(cart.cart.get(Integer.parseInt(index1)-1));
                    break;
                case 4: // Showing cart and summary price
                    cart.showCart();
                    System.out.println("Summary price: " + Cart.totalPrice + "$");
                    break;
                case 5:
                    process = false;
                    break;
            }
        }
    }
}
