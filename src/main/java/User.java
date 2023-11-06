import org.openqa.selenium.WebDriver;

public class User {
    private WebDriver webDriver;

    public User(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public String name;
    public String surname;
    public String address;
    public String phone;


    public User(String name, String surname, String address, String phone) {
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.phone = phone;
    }

}
