package business.pagemodels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import core.BasePage;

public class AboutPage extends BasePage {
    private By aboutPageHeaderLocator = By.cssSelector(".font_0 > span:nth-child(1)");

    public AboutPage() throws IllegalAccessException {
        if (!driver.getTitle().equals("About | Péter Földházi Jr.")) {
            throw new IllegalAccessException("You are not on the About Page, current page is: " +
                    driver.getCurrentUrl());
        }
    }

    public WebElement aboutPageHeader() {
        return driver.findElement(aboutPageHeaderLocator);
    }
}
