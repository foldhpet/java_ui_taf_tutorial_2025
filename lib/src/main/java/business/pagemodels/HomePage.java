package business.pagemodels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import core.BasePage;

public class HomePage extends BasePage {
    private By homePageHeaderLocator = By.cssSelector("a.wixui-rich-text__text");

    public HomePage() throws IllegalAccessException {
        if (!driver.getTitle().equals("Péter Földházi Jr. - Test Automation")) {
            throw new IllegalAccessException("You are not on the Home Page, current page is: " +
                    driver.getCurrentUrl());
        }
    }

    public WebElement homePageHeader() {
        return driver.findElement(homePageHeaderLocator);
    }
}