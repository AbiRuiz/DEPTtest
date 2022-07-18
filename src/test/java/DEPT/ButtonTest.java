package DEPT;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import pagesDEPT.*;

public class ButtonTest extends BaseTests{

    @Test
    public void workPageButton() {
        WorkPage workPage = homePage.clickButtonWork();
        assertTrue(workPage.getVerify().contains("work"));
    }

    @Test
    public void culturePageButton() {
        CulturePage culturePage = homePage.clickButtonCulture();
        assertTrue(culturePage.getVerify().contains("heart"));
    }

    @Test
    public void servicesPageButton() {
        ServicesPage servicesPage = homePage.clickButtonServices();
        assertTrue(servicesPage.getVerify().contains("service"));
    }

    @Test
    public void insightsPageButton() {
        InsightsPage insightsPage = homePage.clickButtonInsights();
        assertTrue(insightsPage.getVerify().contains("New"));
    }

    @Test
    public void careersPageButton() {
        CareersPage careersPage = homePage.clickButtonCareers();
        assertTrue(careersPage.getVerify().contains("limitless"));
    }

    @Test
    public void contactPageButton() {
        ContactPage contactPage = homePage.clickButtonContact();
        assertTrue(contactPage.getVerify().contains("accelerate"));
    }

    @Test
    public void IndustriesPageButton() {
        IndustriesPage industriesPage = homePage.clickButtonIndustries();
        assertTrue(industriesPage.getVerify().contains("marketing"));
    }

    @Test
    public void PartnersPageButton() {
        PartnersPage partnersPage = homePage.clickButtonPartners();
        assertTrue(partnersPage.getVerify().contains("Key"));
    }

    @Test
    public void EventsPageButton() {
        EventsPage eventsPage = homePage.clickButtonEvents();
        assertTrue(eventsPage.getVerify().contains("event"));
    }

    @Test
    public void WhitepapersPageutton() {
        WhitepapersPage whitepapersPage = homePage.clickButtonWhitepapers();
        assertTrue(whitepapersPage.getVerify().contains("Whitepaper"));
    }

}