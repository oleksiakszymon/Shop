package comunication;

import java.security.spec.RSAOtherPrimeInfo;

public class Output {

    public void showClientOptions(){
        System.out.println("What do you want to do? (Choose number)");
        System.out.println("1. List products");
        System.out.println("2. Add product to cart");
        System.out.println("3. Remove product from cart");
        System.out.println("4. Show my cart");
        System.out.println("5. Exit\n");
    }
    public void sortBy(){
        System.out.println("Sort by:");
        System.out.println("1. Name ascending");
        System.out.println("2. Name descending");
        System.out.println("3. Price ascending");
        System.out.println("4. Price descending\n");
    }

}
