package business.pagemodels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import core.BasePage;
import core.Driver;

public class ArticlesPage extends BasePage {
    private By articlesPageHeaderLocator = By.cssSelector(".font_0 > span:nth-child(1)");

    public ArticlesPage() throws IllegalAccessException {
        if (!driver.getTitle().equals("Articles | Péter Földházi Jr.")) {
            throw new IllegalAccessException("You are not on the Articles Page, current page is: " +
                    Driver.getDriver().getCurrentUrl());
        }
    }

    public WebElement articlesPageHeader() {
        return driver.findElement(articlesPageHeaderLocator);
    }
}
