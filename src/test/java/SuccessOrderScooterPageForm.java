import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class SuccessOrderScooterPageForm {
    private WebDriver webDriver;

    @Before
    public void setup() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments(new String[]{"--remote-allow-origins=*"});
        this.webDriver = new ChromeDriver(options);
        this.webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3L));
    }

    @Test
    public void successPassFirstSetClientOrderForm() {
        SelectorsOrderPage selectorsOrderPage = new SelectorsOrderPage(this.webDriver);
        Steps steps = new Steps(this.webDriver);
        ClientData clientData = new ClientData(this.webDriver);
        steps
                .open(SelectorsOrderPage.URL_ORDER_CLIENT_PAGE)
                .inputText(selectorsOrderPage.getNameFieldOrderForm(), ClientData.FirstSetDataSuccessClient.name)
                .inputText(selectorsOrderPage.getSurnameFieldOrderForm(), ClientData.FirstSetDataSuccessClient.surname)
                .inputText(selectorsOrderPage.getAddressFieldOrderForm(), ClientData.FirstSetDataSuccessClient.address)
                .click(selectorsOrderPage.getMetroFieldOrderForm())
                .click(selectorsOrderPage.getMetroStationOrderForm())
                .inputText(selectorsOrderPage.getPhoneFieldOrderForm(), ClientData.FirstSetDataSuccessClient.phone)
                .click(selectorsOrderPage.getButtonNextOrderForm());
        Assert.assertEquals(SelectorsOrderPage.assertSuccessFirstFormOrder, steps.getText(selectorsOrderPage.getAssertFirstFormOrder()));
        steps
                .click(selectorsOrderPage.getCalendarFieldOrderForm())
                .click(selectorsOrderPage.setDataCalendarField(ClientData.FirstSetDataSuccessClient.dataCalendar))
                .click(selectorsOrderPage.getRentPeriodField())
                .click(selectorsOrderPage.setRentPeriodSelectDropDownField(1))
                .click(selectorsOrderPage.getBlackCheckboxColor())
                .inputText(selectorsOrderPage.getCommentFieldOrderForm(), ClientData.FirstSetDataSuccessClient.comment)
                .click(selectorsOrderPage.getButtonOrderOrderForm())
                .click(selectorsOrderPage.getButtonYesOrderForm());
        Assert.assertEquals(SelectorsOrderPage.assertSuccessSecondFormOrder, steps.getText(selectorsOrderPage.getAssertSecondFormOrder()));
    }

    @Test
    public void successPassSecondSetClientOrderForm() {
        SelectorsOrderPage selectorsOrderPage = new SelectorsOrderPage(this.webDriver);
        Steps steps = new Steps(this.webDriver);
        steps
                .open(SelectorsOrderPage.URL_ORDER_CLIENT_PAGE)
                .inputText(selectorsOrderPage.getNameFieldOrderForm(), ClientData.SecondSetDataSuccessClient.name)
                .inputText(selectorsOrderPage.getSurnameFieldOrderForm(), ClientData.SecondSetDataSuccessClient.surname)
                .inputText(selectorsOrderPage.getAddressFieldOrderForm(), ClientData.SecondSetDataSuccessClient.address)
                .click(selectorsOrderPage.getMetroFieldOrderForm())
                .click(selectorsOrderPage.getMetroStationOrderForm())
                .inputText(selectorsOrderPage.getPhoneFieldOrderForm(), ClientData.SecondSetDataSuccessClient.phone)
                .click(selectorsOrderPage.getButtonNextOrderForm());
        Assert.assertEquals(SelectorsOrderPage.assertSuccessFirstFormOrder, steps.getText(selectorsOrderPage.getAssertFirstFormOrder()));
        steps
                .click(selectorsOrderPage.getCalendarFieldOrderForm())
                .click(selectorsOrderPage.setDataCalendarField(ClientData.SecondSetDataSuccessClient.dataCalendar))
                .click(selectorsOrderPage.getRentPeriodField())
                .click(selectorsOrderPage.setRentPeriodSelectDropDownField(2))
                .click(selectorsOrderPage.getGreyCheckboxColor())
                .inputText(selectorsOrderPage.getCommentFieldOrderForm(), ClientData.SecondSetDataSuccessClient.comment)
                .click(selectorsOrderPage.getButtonOrderOrderForm())
                .click(selectorsOrderPage.getButtonYesOrderForm());
        Assert.assertEquals(SelectorsOrderPage.assertSuccessSecondFormOrder, steps.getText(selectorsOrderPage.getAssertSecondFormOrder()));
    }

    @After
    public void teardown() {
        this.webDriver.quit();
    }
}