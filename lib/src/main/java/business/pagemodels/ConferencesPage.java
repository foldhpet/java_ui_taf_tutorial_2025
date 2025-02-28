package business.pagemodels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import core.BasePage;
import core.Driver;

public class ConferencesPage extends BasePage {
    private By conferencesPageHeaderLocator = By.cssSelector(".font_0 > span:nth-child(1)");

    public ConferencesPage() throws IllegalAccessException {
        if (!driver.getTitle().equals("Conferences | Péter Földházi Jr.")) {
            throw new IllegalAccessException("You are not on the Conferences Page, current page is: " +
                    Driver.getDriver().getCurrentUrl());
        }
    }

    public WebElement conferencesPageHeader() {
        return driver.findElement(conferencesPageHeaderLocator);
    }
}
