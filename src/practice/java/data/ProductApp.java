package practice.java.data;

public class ProductApp {
    public static void main(String[] args) {
        Product product = new Product("Shoes", 5000);
        System.out.println(product.name);

        System.out.println(product);

        Product product2 = new Product("Shoes", 5000);

        System.out.println(product.equals(product2));
        System.out.println(product.hashCode() == product2.hashCode());
    }

}
