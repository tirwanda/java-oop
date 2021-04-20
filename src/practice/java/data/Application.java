package practice.java.data;

public class Application {
    public static final int PROCESSOR;

    static {
        System.out.println("Access class application");
        PROCESSOR = Runtime.getRuntime().availableProcessors();
    }
}
