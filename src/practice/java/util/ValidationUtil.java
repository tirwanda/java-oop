package practice.java.util;

import practice.java.anotation.NotBlank;
import practice.java.data.LoginRequest;
import practice.java.error.BlankException;
import practice.java.error.ValidationException;

import java.lang.reflect.Field;

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

    public static void validationReflection(Object object) {
        Class aClass = object.getClass();
        Field[] fields = aClass.getDeclaredFields();

        for (var field: fields) {
            field.setAccessible(true);

            if(field.getAnnotation(NotBlank.class) != null) {
                try {
                    String value = (String) field.get(object);

                    if(value == null || value.isBlank()) {
                        throw new BlankException("Field " + field.getName() + " is Blank");
                    }
                } catch (IllegalAccessException exception) {
                    System.out.println("Can't access field " + field.getName());
                }
            }
        }
    }
}
