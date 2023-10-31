package Workshop_Day2;

public class User {
    private String userName;
    private String userSurname;

    public User() {
    }

    public User(String userName, String userSurname) {
        this.userName = userName;
        this.userSurname = userSurname;
    }
    public String getName() {
        return userName;
    }

    public void setName(String name) {
        this.userName = userName;
    }
    public String getSurname() {
        return userSurname;
    }

    public void setSurname(String userSurname) {
        this.userSurname = userSurname;
    }
}
