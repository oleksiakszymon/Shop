package products;

public class Product {

        public String name;
        public double price;
        public int amount;

        public Product(String name, double price, int amount) {
            this.name = name;
            this.price = price;
            this.amount = amount;
        }

        public Product(Product product){
            this.name = product.name;
            this.price = product.price;
            this.amount = product.amount;
        }

}
