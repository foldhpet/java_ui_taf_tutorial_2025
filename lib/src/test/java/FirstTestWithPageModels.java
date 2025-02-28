import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import business.FoldhaziTest;
import business.pagemodels.AboutPage;
import business.pagemodels.ArticlesPage;
import business.pagemodels.BlogPage;
import business.pagemodels.ConferencesPage;
import business.pagemodels.ContactPage;
import business.pagemodels.HomePage;

import org.openqa.selenium.By;

public class FirstTestWithPageModels extends FoldhaziTest {

    @Test
    public void OpenHomePage() throws IllegalAccessException {
        HomePage homePage = new HomePage();
        assertEquals("Péter Földházi Jr.", homePage.homePageHeader().getText());

        driver.findElement(By.id("comp-kd46oy0r1label")).click();
        AboutPage aboutPage = new AboutPage();
        assertEquals("ABOUT", aboutPage.aboutPageHeader().getText());

        driver.findElement(By.id("comp-kd46oy0r2label")).click();
        ConferencesPage conferencesPage = new ConferencesPage();
        assertEquals("CONFERENCES", conferencesPage.conferencesPageHeader().getText());

        driver.findElement(By.id("comp-kd46oy0r3label")).click();
        ArticlesPage articlesPage = new ArticlesPage();
        assertEquals("HIGHLIGHTED ARTICLES", articlesPage.articlesPageHeader().getText());

        driver.findElement(By.id("comp-kd46oy0r4label")).click();
        BlogPage blogPage = new BlogPage();
        assertEquals("BLOG", blogPage.blogPageHeader().getText());

        driver.findElement(By.id("comp-kd46oy0r5label")).click();
        ContactPage contactPage = new ContactPage();
        assertEquals("CONTACT", contactPage.contactPageHeader().getText());
    }
}
