package practice.java.application;

public class equalsApp {
    public static void main(String[] args) {
        String first = "Edho";
        first = first + " " + "Dwi";

        System.out.println(first);

        String second = "Edho Dwi";

        System.out.println(second);

        System.out.println(first.equals(second));
    }
}
