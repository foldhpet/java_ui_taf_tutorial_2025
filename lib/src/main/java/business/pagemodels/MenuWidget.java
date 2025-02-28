package business.pagemodels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import core.BasePage;

public class MenuWidget extends BasePage {
    private By aboutPageMenuItemLocator = By.id("comp-kd46oy0r1label");
    private By conferencesPageMenuItemLocator = By.id("comp-kd46oy0r2label");
    private By articlesPageMenuItemLocator = By.id("comp-kd46oy0r3label");
    private By blogPageMenuItemLocator = By.id("comp-kd46oy0r4label");
    private By contactPageMenuItemLocator = By.id("comp-kd46oy0r5label");

    public WebElement aboutPageMenuItem() {
        return driver.findElement(aboutPageMenuItemLocator);
    }

    public WebElement conferencesPageMenuItem() {
        return driver.findElement(conferencesPageMenuItemLocator);
    }

    public WebElement articlesPageMenuItem() {
        return driver.findElement(articlesPageMenuItemLocator);
    }

    public WebElement blogPageMenuItem() {
        return driver.findElement(blogPageMenuItemLocator);
    }

    public WebElement contactPageMenuItem() {
        return driver.findElement(contactPageMenuItemLocator);
    }
}
