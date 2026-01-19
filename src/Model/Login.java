package Model;

public class Login {
    private int loginId;
    private String email;
    private String password;

    public Login(String email, String password, int loginId) {
        this.email = email;
        this.password=password;
        this.loginId=loginId;
    }

    public String getEmail() {
        return email;
    }

    public int getLoginId() {
        return loginId;
    }

    public String getPassword() {
        return password;
    }
}
