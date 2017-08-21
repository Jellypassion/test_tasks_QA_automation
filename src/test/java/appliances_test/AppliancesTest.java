package appliances_test;

import commons.CommonTest;
import core.hotline.page_object.homepage.Appliances_page.AppliancesPage;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

/**
 * Created by HillelMono7 on 8/21/2017.
 */
public class AppliancesTest extends CommonTest{

    public AppliancesTest() throws IOException {

    }

    @Before
    public void webDriverSetUp() {
        driverSetUp();
    }

    @Test
    public void doTest() throws IOException {
        AppliancesPage appliancesPage = new AppliancesPage(getDriver());
        String pagePage = openPage(appliancesPage);
        getDriver().get(pagePage);
        openPage(appliancesPage);
        Assert.assertTrue("There is incorrect default page title", getDriver().getCurrentUrl().contains("bt"));
    }

    @After
    public void WebDriverTearDown() {
        tearDown();
    }

}
