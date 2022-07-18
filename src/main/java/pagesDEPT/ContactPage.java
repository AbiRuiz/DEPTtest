package pagesDEPT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactPage {

    private WebDriver driver;
    private By verify = By.xpath("/html/body/main/div[1]/div[1]/h2");

    public ContactPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getVerify() {
        return driver.findElement(verify).getText();
    }
}
