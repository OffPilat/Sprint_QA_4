import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class MainScooterPageRedirect {
    private WebDriver webDriver;

    @Before
    public void setup() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments(new String[]{"--remote-allow-origins=*"});
        this.webDriver = new ChromeDriver(options);
        this.webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10L));
    }

    @Test
    public void clickingHeaderClientOrderForm() {
        SelectorsMainPage selectorsMainPage = new SelectorsMainPage(this.webDriver);
        Steps steps = new Steps(this.webDriver);
        SelectorsOrderPage selectorsOrderPage = new SelectorsOrderPage(this.webDriver);
        steps
                .open(SelectorsMainPage.URL_MAIN_PAGE)
                .click(selectorsMainPage.getOrderButtonHeader());
        Assert.assertEquals(SelectorsOrderPage.assertTitleFirstFormOrder, steps.getText(selectorsOrderPage.getTitleScooterPageForm()));
    }

    @Test
    public void clickingCenterClientOrderForm() {
        SelectorsMainPage selectorsMainPage = new SelectorsMainPage(this.webDriver);
        Steps steps = new Steps(this.webDriver);
        SelectorsOrderPage selectorsOrderPage = new SelectorsOrderPage(this.webDriver);
        steps
                .open(SelectorsMainPage.URL_MAIN_PAGE)
                .find(selectorsMainPage.getOrderButtonFinish())
                .click(selectorsMainPage.getOrderButtonFinish());
        Assert.assertEquals(SelectorsOrderPage.assertTitleFirstFormOrder, steps.getText(selectorsOrderPage.getTitleScooterPageForm()));
    }

    @Test
    public void clickingScooterLogo() {
        SelectorsMainPage selectorsMainPage = new SelectorsMainPage(this.webDriver);
        Steps steps = new Steps(this.webDriver);
        steps.open(SelectorsMainPage.URL_MAIN_PAGE).click(selectorsMainPage.linkButtonMainPageScooter());
        Assert.assertEquals(SelectorsMainPage.assertTitleMainPage, steps.getText(selectorsMainPage.getAssertTitleScooterMainPage()));
    }

    @After
    public void teardown() {
        this.webDriver.quit();
    }
}
