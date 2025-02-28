package business.flowmodels;

import static org.junit.jupiter.api.Assertions.assertEquals;

import business.pagemodels.AboutPage;
import business.pagemodels.ArticlesPage;
import business.pagemodels.BlogPage;
import business.pagemodels.ConferencesPage;
import business.pagemodels.ContactPage;
import business.pagemodels.HomePage;
import business.pagemodels.MenuWidget;

public class MenuFlow {

    public void validateHomePageIsOpen() throws IllegalAccessException {
        HomePage homePage = new HomePage();
        assertEquals("Péter Földházi Jr.", homePage.homePageHeader().getText());
    }

    public void clickOnAboutPageMenuItem() throws IllegalAccessException {
        MenuWidget menuWidget = new MenuWidget();
        menuWidget.aboutPageMenuItem().click();
        AboutPage aboutPage = new AboutPage();
        assertEquals("ABOUT", aboutPage.aboutPageHeader().getText());
    }

    public void clickOnConferencesPageMenuItem() throws IllegalAccessException {
        MenuWidget menuWidget = new MenuWidget();
        menuWidget.conferencesPageMenuItem().click();
        ConferencesPage conferencesPage = new ConferencesPage();
        assertEquals("CONFERENCES", conferencesPage.conferencesPageHeader().getText());
    }

    public void clickOnArticlesPageMenuItem() throws IllegalAccessException {
        MenuWidget menuWidget = new MenuWidget();
        menuWidget.articlesPageMenuItem().click();
        ArticlesPage articlesPage = new ArticlesPage();
        assertEquals("HIGHLIGHTED ARTICLES", articlesPage.articlesPageHeader().getText());
    }

    public void clickOnBlogPageMenuItem() throws IllegalAccessException {
        MenuWidget menuWidget = new MenuWidget();
        menuWidget.blogPageMenuItem().click();
        BlogPage blogPage = new BlogPage();
        assertEquals("BLOG", blogPage.blogPageHeader().getText());
    }

    public void clickOnContactPageMenuItem() throws IllegalAccessException {
        MenuWidget menuWidget = new MenuWidget();
        menuWidget.contactPageMenuItem().click();
        ContactPage contactPage = new ContactPage();
        assertEquals("CONTACT", contactPage.contactPageHeader().getText());
    }
}