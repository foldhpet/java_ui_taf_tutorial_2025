package business.pagemodels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import core.BasePage;

public class ContactPage extends BasePage {
    private By contactPageHeaderLocator = By.cssSelector(".font_0 > span:nth-child(1)");

    public ContactPage() throws IllegalAccessException {
        if (!driver.getTitle().equals("Contact | Péter Földházi Jr.")) {
            throw new IllegalAccessException("You are not on the Contact Page, current page is: " +
                    driver.getCurrentUrl());
        }
    }

    public WebElement contactPageHeader() {
        return driver.findElement(contactPageHeaderLocator);
    }
}
