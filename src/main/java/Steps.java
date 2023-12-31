import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Steps {
    private WebDriver webDriver;

    public Steps(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public Steps open(String url) {
        this.webDriver.get(url);
        return this;
    }

    public Steps find(By element) {
        WebElement new_element = this.webDriver.findElement(element);
        ((JavascriptExecutor) this.webDriver).executeScript("arguments[0].scrollIntoView();", new_element);
        return this;
    }

    public Steps click(By element) {
        this.webDriver.findElement(element).click();
        return this;
    }

    public Steps inputText(By element, String text) {
        this.webDriver.findElement(element).sendKeys(text);
        return this;
    }

    public String getText(By element) {
        return this.webDriver.findElement(element).getText();
    }

    public Steps waitWithAttribute(int Seconds, By selector, String attribute, String condition) {
        (new WebDriverWait(this.webDriver, Duration.ofSeconds(Seconds)))
                .until(ExpectedConditions.attributeToBe(selector, attribute, condition));
        return this;
    }
}

// метод прокрутки страницы

