package business.pagemodels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import core.BasePage;
import core.Driver;

public class BlogPage extends BasePage {
    private By blogPageHeaderLocator = By.cssSelector(".font_0 > span:nth-child(1)");

    public BlogPage() throws IllegalAccessException {
        if (!driver.getTitle().equals("Blog | Péter Földházi Jr.")) {
            throw new IllegalAccessException("You are not on the Blog Page, current page is: " +
                    Driver.getDriver().getCurrentUrl());
        }
    }

    public WebElement blogPageHeader() {
        return driver.findElement(blogPageHeaderLocator);
    }
}
