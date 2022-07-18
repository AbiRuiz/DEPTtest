package pagesDEPT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private WebDriver driver;
    private By buttonWorkLink = By.xpath("//a[.='Work']");
    private By buttonCultureLink = By.xpath("//a[.='Culture']");
    private By buttonServicesLink = By.xpath("//a[.='Services']");
    private By buttonInsightsLink = By.xpath("//a[.='Insights']");
    private By buttonCareersLink = By.xpath("//a[.='Careers']");
    private By buttonContactLink = By.xpath("//a[.='Contact']");
    private By buttonMenuLink = By.xpath("/html/body/div[1]/button");
    private By buttonIndustriesLink = By.xpath("//a[.='Industries']");
    private By buttonPartnersLink = By.xpath("//a[.='Partners']");
    private By buttonEventsLink = By.xpath("//a[.='Events']");
    private By buttonWhitepapersLink = By.xpath("//a[.='Whitepapers']");


    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public WorkPage clickButtonWork() {
        driver.findElement(buttonWorkLink).click();
        return new WorkPage(driver);
    }

    public CulturePage clickButtonCulture() {
        driver.findElement(buttonCultureLink).click();
        return new CulturePage(driver);
    }

    public ServicesPage clickButtonServices() {
        driver.findElement(buttonServicesLink).click();
        return new ServicesPage(driver);
    }

    public InsightsPage clickButtonInsights() {
        driver.findElement(buttonInsightsLink).click();
        return new InsightsPage(driver);
    }

    public CareersPage clickButtonCareers() {
        driver.findElement(buttonCareersLink).click();
        return new CareersPage(driver);
    }

    public ContactPage clickButtonContact() {

        driver.findElement(buttonContactLink).click();
        return new ContactPage(driver);
    }

    public IndustriesPage clickButtonIndustries() {
        driver.findElement(buttonMenuLink).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(buttonIndustriesLink).click();
        return new IndustriesPage(driver);
    }

    public PartnersPage clickButtonPartners() {
        driver.findElement(buttonMenuLink).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(buttonPartnersLink).click();
        return new PartnersPage(driver);
    }

    public EventsPage clickButtonEvents() {
        driver.findElement(buttonMenuLink).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(buttonEventsLink).click();
        return new EventsPage(driver);
    }

    public WhitepapersPage clickButtonWhitepapers() {
        driver.findElement(buttonMenuLink).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(buttonWhitepapersLink).click();
        return new WhitepapersPage(driver);
    }
}