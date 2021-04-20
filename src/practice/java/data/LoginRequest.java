package practice.java.data;

public record LoginRequest(String username, String passsword) {
    public LoginRequest {
        System.out.println("Create Object Login Request");
    }

    public LoginRequest(String username) {
        this(username, "");
    }

    public LoginRequest() {
        this("", "");
    }

}
