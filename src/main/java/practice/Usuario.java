package practice;

public class Usuario implements ICredentials, IShipping, IEmail, IBodyMeasure {

    private int headSize;
    private String email;
    private int number;
    private String address;
    String password;
    String username;

    public Usuario(){}


    public Usuario(String s, String _username) {
        password = s;
        username = _username;
    }

    public Usuario(String address, int number) {
        this.address = address;
        this.number = number;
    }

    public Usuario(String email) {
        this.email = email;
    }

    public Usuario(int headSize) {
        this.headSize = headSize;
    }

    public String GetPassword() {
        return password;
    }

    public String GetUsername() {
        return username;
    }

    public String GetAddress() {
        return this.address;
    }

    public int GetHouseNumber() {
        return this.number;
    }

    public String GetEmail() {
        return this.email;
    }

    public int GetHeadSize() {
        return this.headSize;
    }
}
