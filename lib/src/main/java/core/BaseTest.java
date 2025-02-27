package core;

import org.openqa.selenium.WebDriver;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

public class BaseTest {
    protected WebDriver driver;

    @BeforeEach
    public void Setup() {
        driver = Driver.getDriver();
    }

    @AfterEach
    public void TearDown() {
        Driver.closeDriver();
    }
}
