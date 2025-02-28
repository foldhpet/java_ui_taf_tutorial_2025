import org.junit.jupiter.api.Test;

import business.FoldhaziTest;
import business.flowmodels.MenuFlow;

public class FirstTestWithFlowModels extends FoldhaziTest {

    @Test
    public void OpenHomePage() throws IllegalAccessException {
        MenuFlow menuFlow = new MenuFlow();
        menuFlow.validateHomePageIsOpen();
        menuFlow.clickOnAboutPageMenuItem();
        menuFlow.clickOnConferencesPageMenuItem();
        menuFlow.clickOnArticlesPageMenuItem();
        menuFlow.clickOnBlogPageMenuItem();
        menuFlow.clickOnContactPageMenuItem();
    }
}
