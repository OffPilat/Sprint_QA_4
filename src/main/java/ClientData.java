import org.openqa.selenium.WebDriver;

public class ClientData {

    private final WebDriver webDriver;

    public ClientData(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public class FirstSetDataSuccessClient {
        public static final String name = "Иван";
        public static final String surname = "Иванов";
        public static final String address = "Ленина 1";
        public static final String phone = "99279344115";
        public static final String dataCalendar = "30-е октября 2023";
        public static final String comment = "Комментарий";
    }

    public class SecondSetDataSuccessClient {
        public static final String name = "Гаврила";
        public static final String surname = "Ротенберг";
        public static final String address = "Москва, Волоколамское шоссе 1";
        public static final String phone = "123456789123";
        public static final String dataCalendar = "1-е ноября 2023";
        public static final String comment = "Новый комментарий";
    }

}
