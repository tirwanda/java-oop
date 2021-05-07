package practice.java.application;

import practice.java.data.CreateUserRequest;
import practice.java.util.ValidationUtil;

public class ReflectionApp {
    public static void main(String[] args) {
        CreateUserRequest request = new CreateUserRequest();
        request.setUsername("Edho");
        request.setPassword("Rahasia");

        ValidationUtil.validationReflection(request);
    }
}
