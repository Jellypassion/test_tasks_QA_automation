package commons;

import core.hotline.page_object.homepage.Appliances_page.AppliancesPage;
import core.hotline.page_object.homepage.Common.AbstractPage;
import core.hotline.page_object.homepage.Common.Utils.PropertyUtils;
import core.hotline.page_object.homepage.Common.Utils.WebdriverUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

/**
 * Created by HillelMono7 on 8/21/2017.
 */
public class CommonTest {

    protected WebDriver driver;
    private PropertyUtils propertyUtils = null;

    //создаем конструктор для подтягивания данных из проперти файла (est.properties)
    public CommonTest() throws IOException {
        this.propertyUtils = new PropertyUtils();
        driver = new ChromeDriver();
        driverSetUp();
    }

    protected void driverSetUp() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    protected void tearDown() {
        driver.close();
    }

    protected WebDriver getDriver() {
        return driver;
    }

    protected <T extends AbstractPage> String openPage(T page) throws IOException {
        return WebdriverUtils.getDefaultPathByPage(page);
    }

}
