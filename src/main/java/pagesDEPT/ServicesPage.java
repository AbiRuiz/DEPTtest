package pagesDEPT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ServicesPage {

    private WebDriver driver;
    private By verify = By.xpath("/html/body/main/div[1]/h1");

    public ServicesPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getVerify() {
        return driver.findElement(verify).getText();
    }
}
