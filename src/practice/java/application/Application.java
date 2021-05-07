package practice.java.application;

import practice.java.anotation.Fancy;
import practice.java.data.Product;

@Fancy(name = "Product", tags = {"Laptop", "Programmer"})
public class Application {
    public static void main(String[] args) {
        Product product = new Product("Mac Book Pro", 30000000);
        System.out.println(product.name);
        System.out.println(product.price);
    }
}
