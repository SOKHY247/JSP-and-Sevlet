package num.student.demo.model;

public class UserModel {
    private int id;
    private String name;
    private String email;
    private String address;
    public UserModel(int id, String name, String email, String address) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.address = address;
    }

    public UserModel(String address, String email, int id, String name) {
        this.address = address;
        this.email = email;
        this.id = id;
        this.name = name;
    }
}
