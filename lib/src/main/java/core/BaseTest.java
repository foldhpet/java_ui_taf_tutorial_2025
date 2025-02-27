package core;

import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

public class BaseTest {
    protected ChromeDriver driver;

    @BeforeEach
    public void Setup() {
        driver = new ChromeDriver();
    }

    @AfterEach
    public void TearDown() {
        driver.quit();
    }
}
