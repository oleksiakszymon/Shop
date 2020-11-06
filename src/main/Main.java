package main;

import products.AddingProducts;
import koszyk.Koszyk;
import products.Output;

public class Main {

    public static void main(String[] args) {

        Koszyk myCart = new Koszyk();
        AddingProducts list = new AddingProducts();

        list.createProductsList();

        Output output = new Output();

        double priceSummary = 0;
        boolean process = true;

        while(process){
            switch (output.showClientOptions()) {

                case 1: //Showing products
                    list.showProductList();
                    break;

                case 2: //Adding to cart
                    priceSummary=+myCart.addToCart(list);
                    break;
                case 3: // Removing from cart
                    priceSummary = priceSummary - myCart.removeFromCart(myCart);
                    break;
                case 4: // Showing cart and summary price
                    myCart.showCart();
                    System.out.println("Summary price: " + priceSummary + "$");
                    break;
                case 5:
                    process = false;
                    break;
            }
        }
    }
}
