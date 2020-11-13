package main;

import products.Product;
import products.Shop;
import cart.Cart;
import products.Output;

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
                    shop.showProductList();
                    break;

                case 2: //Adding to cart
                    System.out.println("Which product do you want to add to your cart?");
                    shop.showProductList();
                    String index = scan.nextLine();
                    Product chosen = shop.productsList.get(Integer.parseInt(index)-1);
                    System.out.println("What amount?");
                    int t = Integer.parseInt(scan.nextLine());
                    cart.addToCart(chosen, t);


                    break;
                case 3: // Removing from cart
                    cart.showCart();
                    System.out.println("Which product do you want to remove?");
                    String index1 = scan.nextLine();
                    System.out.println("What amount do you want to remove");
                    String amount = scan.nextLine();
                    cart.removeFromCart(cart.cart.get(Integer.parseInt(index1)-1), Integer.parseInt(amount));
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
