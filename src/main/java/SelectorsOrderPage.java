import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SelectorsOrderPage {
    private final WebDriver webDriver;

    public SelectorsOrderPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public static final String URL_ORDER_CLIENT_PAGE = "https://qa-scooter.praktikum-services.ru/order";
    public static String assertSuccessFirstFormOrder = "Про аренду";
    public static String assertSuccessSecondFormOrder = "Заказ оформлен";
    public static String assertTitleFirstFormOrder = "Для кого самокат";

    private By nameFieldOrderForm = By.xpath(".//input[contains (@placeholder,'Имя')] ");

    public By getNameFieldOrderForm() {
        return this.nameFieldOrderForm;
    }

    private By surnameFieldOrderForm = By.xpath(".//input[contains (@placeholder,'Фамилия')]");

    public By getSurnameFieldOrderForm() {
        return this.surnameFieldOrderForm;
    }

    private By addressFieldOrderForm = By.xpath(".//input[contains (@placeholder,'Адрес')]");

    public By getAddressFieldOrderForm() {
        return this.addressFieldOrderForm;
    }

    private By metroFieldOrderForm = By.xpath(".//input[contains (@placeholder,'метро')]");

    public By getMetroFieldOrderForm() {
        return this.metroFieldOrderForm;
    }

    private By metroStationOrderForm = By.xpath(".//div[text()='Черкизовская']");

    public By getMetroStationOrderForm() {
        return this.metroStationOrderForm;
    }

    private By phoneFieldOrderForm = By.xpath(".//input[contains (@placeholder,'Телефон')]");

    public By getPhoneFieldOrderForm() {
        return this.phoneFieldOrderForm;
    }

    private By buttonNextOrderForm = By.xpath(".//button[contains (text(), 'Далее')]");

    public By getButtonNextOrderForm() {
        return this.buttonNextOrderForm;
    }


    private By calendarFieldOrderForm = By.cssSelector(".react-datepicker__input-container");

    public By getCalendarFieldOrderForm() {
        return this.calendarFieldOrderForm;
    }

    private By calendarDataSelectOrderForm = By.xpath(".//div[contains (@aria-label, '1-е ноября 2023')]");

    public By getCalendarDataSelectOrderForm() {
        return this.calendarDataSelectOrderForm;
    }

    private By rentPeriodField = By.cssSelector(".Dropdown-root");

    public By getRentPeriodField() {
        return this.rentPeriodField;
    }

    private By rentPeriodSelectDropDownField = By.xpath(".//div[@class='Dropdown-option'][1]");

    public By getRentPeriodSelectDropDownField() {
        return this.rentPeriodSelectDropDownField;
    }

    private By checkboxColor1 = By.cssSelector("#black");

    public By getBlackCheckboxColor() {
        return this.checkboxColor1;
    }

    private By checkboxColor2 = By.cssSelector("#grey");

    public By getGreyCheckboxColor() {
        return this.checkboxColor2;
    }

    private By commentFieldOrderForm = By.xpath(".//input[contains (@placeholder,'Комментарий')]");

    public By getCommentFieldOrderForm() {
        return this.commentFieldOrderForm;
    }

    private By buttonOrderOrderForm = By.xpath(".//div[contains (@class,'Order')]/button[contains (text(), 'Заказать')]");

    public By getButtonOrderOrderForm() {
        return this.buttonOrderOrderForm;
    }

    private By buttonYesOrderForm = By.xpath(".//div[contains (@class,'Order')]/button[contains (text(), 'Да')]");

    public By getButtonYesOrderForm() {
        return this.buttonYesOrderForm;
    }

    public By assertFirstFormOrder = By.cssSelector("div .Order_Header__BZXOb");

    public By getAssertFirstFormOrder() {
        return this.assertFirstFormOrder;
    }

    public By assertSecondFormOrder = By.cssSelector("div .Order_ModalHeader__3FDaJ");

    public By getAssertSecondFormOrder() {
        return this.assertSecondFormOrder;
    }

    private By titleScooterPageForm = By.cssSelector("div .Order_Header__BZXOb");

    public By getTitleScooterPageForm() {
        return this.titleScooterPageForm;
    }

    public By setDataCalendarField(String data) {
        return By.xpath(".//div[contains (@aria-label, '" + data + "')]");
    }

    public By setRentPeriodSelectDropDownField(int number) {
        return By.xpath(".//div[@class='Dropdown-option'][" + number + "]");
    }


}
