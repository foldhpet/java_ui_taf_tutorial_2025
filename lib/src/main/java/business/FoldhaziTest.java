package business;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import core.BaseTest;

public class FoldhaziTest extends BaseTest {

    @BeforeEach
    @Override
    public void Setup() {
        super.Setup();

        driver.get("https://www.peterfoldhazi.com");
        assertEquals("Péter Földházi Jr. - Test Automation", driver.getTitle());
    }
}
