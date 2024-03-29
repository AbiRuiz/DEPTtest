package pagesDEPT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CulturePage {

    private WebDriver driver;
    private By verify = By.xpath("/html/body/main/div[1]/h1");

    public CulturePage(WebDriver driver) {
        this.driver = driver;
    }

    public String getVerify() {
        return driver.findElement(verify).getText();
    }
}