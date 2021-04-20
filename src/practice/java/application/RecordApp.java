package practice.java.application;

import practice.java.data.LoginRequest;

public class RecordApp {
    public static void main(String[] args) {
        LoginRequest loginRequest = new LoginRequest("edho", "rahasia");
        System.out.println(loginRequest.username());
        System.out.println(loginRequest.passsword());
        System.out.println(loginRequest);

        System.out.println(new LoginRequest());
        System.out.println(new LoginRequest("edo"));
        System.out.println(new LoginRequest("dwi", "rahasia"));
    }
}
