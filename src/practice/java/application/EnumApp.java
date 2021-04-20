package practice.java.application;

import practice.java.data.Customer;
import practice.java.data.Level;

public class EnumApp {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setName("Edho");
        customer.setLevel(Level.PREMIUM);

        System.out.println(customer.getName());
        System.out.println(customer.getLevel());
        System.out.println(customer.getLevel().getDescription());

        String levelName = Level.VIP.name();
        System.out.println(levelName);

        Level level = Level.valueOf("VIP");
        System.out.println(level);

        Level[] levels = Level.values();
        System.out.println("Print Level");
        for (var value : level.values()) {
            System.out.println(value);
        }
    }
}
