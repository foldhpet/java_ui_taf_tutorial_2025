import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import business.FoldhaziTest;
import business.pagemodels.AboutPage;
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
        assertEquals("Conferences | Péter Földházi Jr.", driver.getTitle());

        driver.findElement(By.id("comp-kd46oy0r3label")).click();
        assertEquals("Articles | Péter Földházi Jr.", driver.getTitle());

        driver.findElement(By.id("comp-kd46oy0r4label")).click();
        assertEquals("Blog | Péter Földházi Jr.", driver.getTitle());

        driver.findElement(By.id("comp-kd46oy0r5label")).click();
        assertEquals("Contact | Péter Földházi Jr.", driver.getTitle());
    }
}
