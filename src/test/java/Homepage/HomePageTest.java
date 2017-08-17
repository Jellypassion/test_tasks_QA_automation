package Homepage;

import core.hotline.page_object.homepage.Common.Utils.PropertyUtils;
import core.hotline.page_object.homepage.Homepage.HomePage;
import core.hotline.page_object.homepage.search_result_page.SearchResutPage;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Created by HillelMono7 on 8/14/2017.
 */
public class HomePageTest {

    private WebDriver driver;
    private PropertyUtils propertyUtils = null;

    //создаем конструктор для подтягивания данных из проперти файла (est.properties)
    public HomePageTest() throws IOException {
        this.propertyUtils = new PropertyUtils();
    }


    @Before
    public void driverSetUp() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(propertyUtils.getProperty("main.site.url"));
    }

    @Test
    public void searchBarTesting() {
        HomePage HomePage = new HomePage(driver);
        String searchCondition = "Samsung";
        SearchResutPage SearchResultPage = HomePage.searchByText("samsung");
        List<String> titles = SearchResultPage.getSearchResults();
        for (String title : titles) {
            Assert.assertTrue(String.format("There is incorrect item text; EX [%s], ACT: [%s]", searchCondition, title), title.contains(searchCondition));
        }

    }

    @After
    public void tearDown() {
        driver.close();
    }

}
