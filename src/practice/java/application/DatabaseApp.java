package practice.java.application;

import practice.java.error.DatabaseError;

public class DatabaseApp {
    public static void main(String[] args) {
        connectDatabase("Edho", null);
        System.out.println("Success");

    }

    public static void connectDatabase(String username, String password) {
        if(username == null || password == null) {
            throw new DatabaseError("Failed to connect database");
        }
    }
}
