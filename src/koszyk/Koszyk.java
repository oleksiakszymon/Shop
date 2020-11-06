package koszyk;

import products.Product;
import products.AddingProducts;

import java.util.ArrayList;
import java.util.Scanner;

public class Koszyk {

    ArrayList<Product> cart = new ArrayList<>();

    public double addToCart(AddingProducts list) {
        System.out.println("Which product do you want to add to your cart?");
        list.showProductList();
        Scanner scan = new Scanner(System.in);
        String index = scan.nextLine();
        Product chosen = list.productsList.get(Integer.parseInt(index)-1);
        System.out.println("What amount?");
        int t = Integer.parseInt(scan.nextLine());
        if(t> chosen.amount){
            System.out.println("Not in stock");
            return 0;
        } else {
            chosen.buy = t;
            cart.add(chosen);
            System.out.println(chosen.name + " successfully added (" + chosen.buy + ")");
        }
        return chosen.price * chosen.buy;
    }


    public void showCart(){
        int i=0;
        for(Product e : cart){
            i++;
            System.out.println(i + ". " + e.name + " (" + e.buy + ")");
        }
        System.out.println();
    }
    public double removeFromCart(Koszyk list) {
        double price;
        Scanner scan = new Scanner(System.in);
        System.out.println("Which product do you want to remove?");
        showCart();
        String index = scan.nextLine();
        System.out.println("What amount do you want to remove");
        String ra = scan.nextLine();
        Product chosen = list.cart.get((Integer.parseInt(index)-1));
        if(Integer.parseInt(ra) < chosen.buy){
            chosen.buy = chosen.buy - Integer.parseInt(ra);
            System.out.println(ra + " removed");
        } else {
            cart.remove(chosen);
            chosen.buy=0;
            System.out.println("Product successfully removed");
        }
        price = chosen.price * chosen.buy;
        return price;
    }
}
