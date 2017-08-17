package core.hotline.page_object.homepage.search_result_page;

import core.hotline.page_object.homepage.Common.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by HillelMono7 on 8/14/2017.
 */
public class SearchResutPage extends AbstractPage {

    @FindAll({@FindBy(xpath = "//a[@data-eventlable='Product name']")})
    private List <WebElement> results;


    public SearchResutPage(WebDriver webDriver) {
        super(webDriver);
    }

    //задача: вытащить список названий результатов поиска (текстом) по запросу 'samsung'

    public List <String> getSearchResults() {
        List<String> resultsTitles = new ArrayList<String>();

        for (WebElement element : results){
            String text = element.getText();
            resultsTitles.add(text);
        }
        return resultsTitles;
    }

}
