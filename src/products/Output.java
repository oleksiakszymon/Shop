package products;

import java.util.Scanner;

public class Output {

    public int showClientOptions(){
        System.out.println("What do you want to do? (Choose number)");
        System.out.println("1. List products");
        System.out.println("2. Add product to cart");
        System.out.println("3. Remove product from cart");
        System.out.println("4. Show my cart");
        System.out.println("5. Exit\n");
        Scanner scan = new Scanner(System.in);
        String number = scan.nextLine();
        return Integer.parseInt(number);

    }

}
