package api.dto;

public class LoginCredentials {

    private String password;
    private String email;
    private String domain;

    public LoginCredentials(String password, String email, String domain) {
        this.password = password;
        this.email = email;
        this.domain = domain;
    }
}
