import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

@RunWith(Parameterized.class)
public class SuccessOrderScooterPageForm {
    private WebDriver webDriver;

    private final String name;
    private final String surname;
    private final String address;
    private final String phone;
    private final String dataCalendar;
    private final int rentPeriod;
    private final By checkboxColor;
    private final String comment;

    public SuccessOrderScooterPageForm(String name, String surname, String address, String phone,
                                       String dataCalendar, int rentPeriod, By checkboxColor, String comment) {
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.phone = phone;
        this.dataCalendar = dataCalendar;
        this.rentPeriod = rentPeriod;
        this.checkboxColor = checkboxColor;
        this.comment = comment;
    }

    @Before
    public void setup() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments(new String[]{"--remote-allow-origins=*"});
        this.webDriver = new ChromeDriver(options);
        this.webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3L));
    }

    @Parameterized.Parameters
    public static Object[][] getListParam() {
        WebDriver webDriver = new ChromeDriver(new ChromeOptions());
        SelectorsOrderPage selectorsOrderPage = new SelectorsOrderPage(webDriver);
        User successUserAlex = new User("Алексей", "Иванов", "Жлебино 1", "123123123123");
        User successUserDemi = new User("Демид", "Сыров", "Москва, Хит 1", "978586145412");
        Order successOrderAlex = new Order("30-е октября 2023", 1, selectorsOrderPage.getGreyCheckboxColor(), "Коммент");
        Order successOrderDemi = new Order("6-е ноября 2023 г.", 2, selectorsOrderPage.getBlackCheckboxColor(), "Новый комментарий");
        return new Object[][]{
                {successUserAlex.name, successUserAlex.surname, successUserAlex.address, successUserAlex.phone, successOrderAlex.dataCalendar,
                        successOrderAlex.rent, successOrderAlex.color, successOrderAlex.comment
                },
                {successUserDemi.name, successUserDemi.surname, successUserDemi.address, successUserDemi.phone, successOrderDemi.dataCalendar,
                        successOrderDemi.rent, successOrderDemi.color, successOrderDemi.comment
                }
        };
    }

    @Test
    public void successPassClientOrderForm() {
        Steps steps = new Steps(this.webDriver);
        SelectorsOrderPage selectorsOrderPage = new SelectorsOrderPage(this.webDriver);
        steps
                .open(SelectorsOrderPage.URL_ORDER_CLIENT_PAGE)
                .inputText(selectorsOrderPage.getNameFieldOrderForm(), this.name)
                .inputText(selectorsOrderPage.getSurnameFieldOrderForm(), this.surname)
                .inputText(selectorsOrderPage.getAddressFieldOrderForm(), this.address)
                .click(selectorsOrderPage.getMetroFieldOrderForm())
                .click(selectorsOrderPage.getMetroStationOrderForm())
                .inputText(selectorsOrderPage.getPhoneFieldOrderForm(), this.phone)
                .click(selectorsOrderPage.getButtonNextOrderForm());
        Assert.assertEquals(SelectorsOrderPage.assertSuccessFirstFormOrder, steps.getText(selectorsOrderPage.getAssertFirstFormOrder()));
        steps
                .click(selectorsOrderPage.getCalendarFieldOrderForm())
                .click(selectorsOrderPage.setDataCalendarField(this.dataCalendar))
                .click(selectorsOrderPage.getRentPeriodField())
                .click(selectorsOrderPage.setRentPeriodSelectDropDownField(this.rentPeriod))
                .click(this.checkboxColor)
                .inputText(selectorsOrderPage.getCommentFieldOrderForm(), this.comment)
                .click(selectorsOrderPage.getButtonOrderOrderForm())
                .click(selectorsOrderPage.getButtonYesOrderForm());
        Assert.assertEquals(SelectorsOrderPage.assertSuccessSecondFormOrder, steps.getText(selectorsOrderPage.getAssertSecondFormOrder()));

    }

    @After
    public void teardown() {
        this.webDriver.quit();
    }
}