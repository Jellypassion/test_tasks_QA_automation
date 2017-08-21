package Homepage;

import commons.CommonTest;
import core.hotline.page_object.homepage.Appliances_page.AppliancesPage;
import core.hotline.page_object.homepage.Common.Utils.WebdriverUtils;
import core.hotline.page_object.homepage.Homepage.HomePage;
import core.hotline.page_object.homepage.search_result_page.SearchResutPage;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

/**
 * Created by HillelMono7 on 8/14/2017.
 */
public class HomePageTest extends CommonTest{

    public HomePageTest() throws IOException {
    }


    @Before
    public void webDriverSetUp() {
        driverSetUp();
    }


    @Test
    public void searchBarTesting() throws IOException {
        HomePage HomePage = new HomePage(driver);
        AppliancesPage appliancesPage = new AppliancesPage(getDriver());
        WebdriverUtils.getDefaultPathByPage(appliancesPage);
        String searchCondition = "Samsung";
        SearchResutPage SearchResultPage = HomePage.searchByText("samsung");
        List<String> titles = SearchResultPage.getSearchResults();
        for (String title : titles) {
            Assert.assertTrue(String.format("There is incorrect item text; EX [%s], ACT: [%s]", searchCondition, title), title.contains(searchCondition));
        }

    }

}
