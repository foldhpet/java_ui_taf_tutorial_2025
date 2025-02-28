import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import business.FoldhaziTest;
import business.pagemodels.AboutPage;
import business.pagemodels.ArticlesPage;
import business.pagemodels.BlogPage;
import business.pagemodels.ConferencesPage;
import business.pagemodels.ContactPage;
import business.pagemodels.HomePage;
import business.pagemodels.MenuWidget;

public class FirstTestWithPageModels extends FoldhaziTest {

    @Test
    public void OpenHomePage() throws IllegalAccessException {
        HomePage homePage = new HomePage();
        assertEquals("Péter Földházi Jr.", homePage.homePageHeader().getText());

        MenuWidget menuWidget = new MenuWidget();
        menuWidget.aboutPageMenuItem().click();
        AboutPage aboutPage = new AboutPage();
        assertEquals("ABOUT", aboutPage.aboutPageHeader().getText());

        menuWidget.conferencesPageMenuItem().click();
        ConferencesPage conferencesPage = new ConferencesPage();
        assertEquals("CONFERENCES", conferencesPage.conferencesPageHeader().getText());

        menuWidget.articlesPageMenuItem().click();
        ArticlesPage articlesPage = new ArticlesPage();
        assertEquals("HIGHLIGHTED ARTICLES", articlesPage.articlesPageHeader().getText());

        menuWidget.blogPageMenuItem().click();
        BlogPage blogPage = new BlogPage();
        assertEquals("BLOG", blogPage.blogPageHeader().getText());

        menuWidget.contactPageMenuItem().click();
        ContactPage contactPage = new ContactPage();
        assertEquals("CONTACT", contactPage.contactPageHeader().getText());
    }
}
