package core.hotline.page_object.homepage.Common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by HillelMono7 on 8/14/2017.
 */
public class AbstractPage {
    protected WebDriver driver;
    public AbstractPage (WebDriver webDriver){
        this.driver = webDriver;
        PageFactory.initElements(webDriver, this);
    }
}


//AbstractPage AbstractPage()