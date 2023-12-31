import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Order {

    private WebDriver webDriver;

    public Order(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public String dataCalendar;
    public String comment;
    public int rent;
    public By color;

    public Order(String dataCalendar, int rent, By color, String comment) {
        this.dataCalendar = dataCalendar;
        this.rent = rent;
        this.comment = comment;
        this.color = color;
    }
}
