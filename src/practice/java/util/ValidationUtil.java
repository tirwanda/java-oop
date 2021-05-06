package practice.java.util;

import practice.java.data.LoginRequest;
import practice.java.error.BlankException;
import practice.java.error.ValidationException;

public class ValidationUtil {
    public static void validate(LoginRequest loginRequest) throws ValidationException, NullPointerException {
        if(loginRequest.username() == null) {
            throw new NullPointerException("Username is null");
        } else if(loginRequest.username().isBlank()) {
            throw new ValidationException("Username is blank");
        } else if(loginRequest.passsword() == null) {
            throw new NullPointerException("Password is null");
        } else if(loginRequest.passsword().isBlank()) {
            throw new ValidationException("Password is blank");
        }

    }

    public static void validateRuntime(LoginRequest loginRequest) {
        if(loginRequest.username() == null) {
            throw new NullPointerException("Username is null");
        } else if(loginRequest.username().isBlank()) {
            throw new BlankException("Username is blank");
        } else if(loginRequest.passsword() == null) {
            throw new NullPointerException("Password is null");
        } else if(loginRequest.passsword().isBlank()) {
            throw new BlankException("Password is blank");
        }
    }
}
