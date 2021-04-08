package practice.java.application;

import practice.java.data.Animal;
import practice.java.data.Cat;

public class AnimalApp {
    public static void main(String[] args) {
        Animal animal = new Cat();
        animal.name = "Mueza";

        animal.run();
    }
}
