package core;

import org.openqa.selenium.WebDriver;

public class BasePage {
    protected WebDriver driver;

    public BasePage() {
        this.driver = Driver.getDriver();
    }
}
