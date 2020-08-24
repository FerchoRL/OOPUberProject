package Java;

public class Account {
    Integer id;
    String name;
    String document;
    String email;
    String password;

    public Account(String name, String doccument, String email, String password) {
        this.name = name;
        this.document = doccument;
        this.email = email;
        this.password = password;
    }
}