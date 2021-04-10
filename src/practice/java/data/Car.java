package practice.java.data;

public interface Car extends hasBrand{
    void drive();
    int getTire();

    default boolean isBig() {
        return false;
    }
}
