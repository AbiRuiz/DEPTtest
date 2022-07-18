package pagesDEPT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WorkPage {

    private WebDriver driver;
    private By verify = By.xpath("//span[.='All work']");

    public WorkPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getVerify() {
        return driver.findElement(verify).getText();
    }
}