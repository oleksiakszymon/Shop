package products;

public class Product implements Comparable<Product> {

        private String name;
        private double price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Product() {}

        public Product(String name, double price) {
            this.name = name;
            this.price = price;
        }

        public Product(Product product){
            this.name = product.name;
            this.price = product.price;
        }

    @Override
    public int compareTo(Product o) {
            int result = this.name.compareTo(o.name);
        return result;
    }


    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
