package Model;

public class User {
    private int userId;
    private String name;
    private Login login;

    public User(Login login, int userId, String name) {
        this.login = login;
        this.userId=userId;
        this.name=name;
    }

    public Login getLogin() {
        return login;
    }

    public String getName() {
        return name;
    }
    public int getUserId(){
        return userId;
    }
}
