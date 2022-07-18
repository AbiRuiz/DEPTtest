package pagesDEPT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EventsPage {

    private WebDriver driver;
    private By verify = By.xpath("/html/body/main/div[1]/div/h2");

    public EventsPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getVerify() {
        return driver.findElement(verify).getText();
    }
}
