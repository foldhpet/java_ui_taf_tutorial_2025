package business.pagemodels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import core.Driver;

public class HomePage {
    private By homePageHeaderLocator = By.cssSelector("a.wixui-rich-text__text");

    public HomePage() throws IllegalAccessException {
        if (!Driver.getDriver().getTitle().equals("Péter Földházi Jr. - Test Automation")) {
            throw new IllegalAccessException("You are not on the Home Page, current page is: " +
                    Driver.getDriver().getCurrentUrl());
        }
    }

    public WebElement homePageHeader() {
        return Driver.getDriver().findElement(homePageHeaderLocator);
    }
}
