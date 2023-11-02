import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

@RunWith(Parameterized.class)
public class MainScooterPage {
    private WebDriver webDriver;
    private final String text;
    private final By selectorButton;
    private final By panelSelector;

    public MainScooterPage(String text, By selectorButton, By panelSelector) {
        this.text = text;
        this.selectorButton = selectorButton;
        this.panelSelector = panelSelector;
    }

    @Before
    public void setup() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        webDriver = new ChromeDriver(options);
    }

    @Parameters
    public static Object[][] getListParam() {
        WebDriver webDriver = new ChromeDriver(new ChromeOptions());
        SelectorsMainPage selectorsMainPage = new SelectorsMainPage(webDriver);
        return new Object[][]{
                {SelectorsMainPage.accordingItemTextButton1,
                        selectorsMainPage.getAccordingItemButton1(),
                        selectorsMainPage.getAccordingItemButton1Text()},
                {SelectorsMainPage.accordingItemTextButton2,
                        selectorsMainPage.getAccordingItemButton2(),
                        selectorsMainPage.getAccordingItemButton2Text()},
                {SelectorsMainPage.accordingItemTextButton3,
                        selectorsMainPage.getAccordingItemButton3(),
                        selectorsMainPage.getAccordingItemButton3Text()},
                {SelectorsMainPage.accordingItemTextButton4,
                        selectorsMainPage.getAccordingItemButton4(),
                        selectorsMainPage.getAccordingItemButton4Text()},
                {SelectorsMainPage.accordingItemTextButton5,
                        selectorsMainPage.getAccordingItemButton5(),
                        selectorsMainPage.getAccordingItemButton5Text()},
                {SelectorsMainPage.accordingItemTextButton6,
                        selectorsMainPage.getAccordingItemButton6(),
                        selectorsMainPage.getAccordingItemButton6Text()},
                {SelectorsMainPage.accordingItemTextButton7,
                        selectorsMainPage.getAccordingItemButton7(),
                        selectorsMainPage.getAccordingItemButton7Text()},
                {SelectorsMainPage.accordingItemTextButton8,
                        selectorsMainPage.getAccordingItemButton8(),
                        selectorsMainPage.getAccordingItemButton8Text()}
        };
    }

    @Test
    public void ValidationTextDropDownListOfQuestions() {
        SelectorsMainPage selectorsMainPage = new SelectorsMainPage(this.webDriver);
        Steps steps = new Steps(this.webDriver);
        steps
                .open(SelectorsMainPage.URL_MAIN_PAGE)
                .find(this.selectorButton)
                .click(this.selectorButton)
                .waitWithAttribute(2, this.selectorButton, "aria-expanded", "true");
        String actualText = steps.getText(this.panelSelector);
        Assert.assertEquals("Тексты не совпадают", this.text, actualText);
    }

    @After
    public void teardown() {
        this.webDriver.quit();
    }
}