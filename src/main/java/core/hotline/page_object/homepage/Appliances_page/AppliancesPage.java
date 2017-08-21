package core.hotline.page_object.homepage.Appliances_page;

import core.hotline.page_object.homepage.Common.AbstractPage;
import core.hotline.page_object.homepage.Common.annotations.DefaultPath;
import org.openqa.selenium.WebDriver;

/**
 * Created by HillelMono7 on 8/17/2017.
 */

@DefaultPath(defaultPath = "/bt")
public class AppliancesPage extends AbstractPage{

    public AppliancesPage(WebDriver webDriver) {
        super(webDriver);
    }

}
