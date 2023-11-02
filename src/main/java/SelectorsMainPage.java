import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SelectorsMainPage {
    private final WebDriver webDriver;
    public static final String URL_MAIN_PAGE = "https://qa-scooter.praktikum-services.ru/";
    public static String assertTitleMainPage = "УЧЕБНЫЙ ТРЕНАЖЕР";
    public static String accordingItemTextButton1 = "Сутки — 400 рублей. Оплата курьеру — наличными или картой.";
    public static String accordingItemTextButton2 = "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.";
    public static String accordingItemTextButton3 = "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.";
    public static String accordingItemTextButton4 = "Только начиная с завтрашнего дня. Но скоро станем расторопнее.";
    public static String accordingItemTextButton5 = "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.";
    public static String accordingItemTextButton6 = "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.";
    public static String accordingItemTextButton7 = "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.";
    public static String accordingItemTextButton8 = "Да, обязательно. Всем самокатов! И Москве, и Московской области.";


    private By accordingItemButton1 = By.xpath(".//div[@class='accordion__item'][1]/div/div[@role='button']");

    public By getAccordingItemButton1() {
        return this.accordingItemButton1;
    }

    private By accordingItemButton2 = By.xpath(".//div[@class='accordion__item'][2]/div/div[@role='button']");

    public By getAccordingItemButton2() {
        return this.accordingItemButton2;
    }

    private By accordingItemButton3 = By.xpath(".//div[@class='accordion__item'][3]/div/div[@role='button']");

    public By getAccordingItemButton3() {
        return this.accordingItemButton3;
    }

    private By accordingItemButton4 = By.xpath(".//div[@class='accordion__item'][4]/div/div[@role='button']");

    public By getAccordingItemButton4() {
        return this.accordingItemButton4;
    }

    private By accordingItemButton5 = By.xpath(".//div[@class='accordion__item'][5]/div/div[@role='button']");

    public By getAccordingItemButton5() {
        return this.accordingItemButton5;
    }

    private By accordingItemButton6 = By.xpath(".//div[@class='accordion__item'][6]/div/div[@role='button']");

    public By getAccordingItemButton6() {
        return this.accordingItemButton6;
    }

    private By accordingItemButton7 = By.xpath(".//div[@class='accordion__item'][7]/div/div[@role='button']");

    public By getAccordingItemButton7() {
        return this.accordingItemButton7;
    }

    private By accordingItemButton8 = By.xpath(".//div[@class='accordion__item'][8]/div/div[@role='button']");

    public By getAccordingItemButton8() {
        return this.accordingItemButton8;
    }

    private By accordingItemButton1Text = By.xpath(".//div[@id='accordion__panel-0']/p");

    public By getAccordingItemButton1Text() {
        return this.accordingItemButton1Text;
    }

    private By accordingItemButton2Text = By.cssSelector("#accordion__panel-1 p");

    public By getAccordingItemButton2Text() {
        return this.accordingItemButton2Text;
    }

    private By accordingItemButton3Text = By.cssSelector("#accordion__panel-2 p");

    public By getAccordingItemButton3Text() {
        return this.accordingItemButton3Text;
    }

    private By accordingItemButton4Text = By.cssSelector("#accordion__panel-3 p");

    public By getAccordingItemButton4Text() {
        return this.accordingItemButton4Text;
    }

    private By accordingItemButton5Text = By.cssSelector("#accordion__panel-4 p");

    public By getAccordingItemButton5Text() {
        return this.accordingItemButton5Text;
    }

    private By accordingItemButton6Text = By.cssSelector("#accordion__panel-5 p");

    public By getAccordingItemButton6Text() {
        return this.accordingItemButton6Text;
    }

    private By accordingItemButton7Text = By.cssSelector("#accordion__panel-6 p");

    public By getAccordingItemButton7Text() {
        return this.accordingItemButton7Text;
    }

    private By accordingItemButton8Text = By.cssSelector("#accordion__panel-7 p");

    public By getAccordingItemButton8Text() {
        return this.accordingItemButton8Text;
    }

    private By orderButtonHeader = By.cssSelector(".Header_Nav__AGCXC .Button_Button__ra12g");

    public By getOrderButtonHeader() {
        return this.orderButtonHeader;
    }

    private By orderButtonFinish = By.cssSelector(".Home_FinishButton__1_cWm .Button_Button__ra12g");

    public By getOrderButtonFinish() {
        return this.orderButtonFinish;
    }

    private By linkButtonMainPageScooter = By.xpath(".//a[contains (@class, 'LogoScooter')]");

    public By linkButtonMainPageScooter() {
        return this.linkButtonMainPageScooter;
    }

    private By linkButtonMainPageYandex = By.xpath(".//a[contains (@class, 'LogoYandex')]");

    public By linkButtonMainPageYandex() {
        return this.linkButtonMainPageYandex;
    }

    public static final String URL_YANDEX_MAIN_PAGE = "https://dzen.ru/";

    public SelectorsMainPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public By assertTitleScooterMainPage = By.cssSelector("div .Header_Disclaimer__3VEni");

    public By getAssertTitleScooterMainPage() {
        return this.assertTitleScooterMainPage;
    }

}
