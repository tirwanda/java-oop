package practice.java.application;

import practice.java.data.LoginRequest;
import practice.java.error.ValidationException;
import practice.java.util.ValidationUtil;

public class ValidationApp {
    public static void main(String[] args) {
        LoginRequest loginRequest = new LoginRequest(null,null);

        try {
            ValidationUtil.validate(loginRequest);
        } catch (ValidationException | NullPointerException exception) {
            System.out.println("Data not valid: " + exception.getMessage());
        } finally {
            System.out.println("Always execution");
        }

        LoginRequest loginRequest2 = new LoginRequest(null, null);

        ValidationUtil.validateRuntime(loginRequest2);

    }
}
