package core.hotline.page_object.homepage.Homepage;

import core.hotline.page_object.homepage.Common.AbstractPage;
import core.hotline.page_object.homepage.search_result_page.SearchResutPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by HillelMono7 on 8/14/2017.
 */
public class HomePage extends AbstractPage{

    @FindBy (id = "searchbox")
    private WebElement searchBar;

    @FindBy (id = "doSearch")
    private WebElement searchButton;

    private WebDriver driver;

    public HomePage(WebDriver webDriver) {
        super(webDriver);
        this.driver = webDriver;
    }

    public SearchResutPage searchByText (String text){
        searchBar.clear();
        searchBar.sendKeys();
        searchButton.click();
        return new SearchResutPage(driver);

    }





}
