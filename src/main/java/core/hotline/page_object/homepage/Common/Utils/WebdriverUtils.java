package core.hotline.page_object.homepage.Common.Utils;

import core.hotline.page_object.homepage.Appliances_page.AppliancesPage;
import core.hotline.page_object.homepage.Common.AbstractPage;
import core.hotline.page_object.homepage.Common.annotations.DefaultPath;

import java.io.IOException;
import java.lang.annotation.Annotation;

/**
 * Created by HillelMono7 on 8/17/2017.
 */
public class WebdriverUtils {

private WebdriverUtils () {
    }

    public static <T extends AbstractPage> String getDefaultPathByPage(T page) throws IOException {
        String annotationValue = null;
        PropertyUtils propertyUtils = new PropertyUtils();
    //получаем класс через обьект класса
    Class pageClass = page.getClass();
//        Annotation defaultPath = pageClass.getAnnotation(DefaultPath.class);
//        String defaultPathValue= defaultPath.
    Annotation[] annotations = pageClass.getDeclaredAnnotations();
    for (Annotation annotation : annotations) {
        //проверка явл. ли аннотация тпипом default Path
        if (annotation instanceof DefaultPath){
            annotationValue = ((DefaultPath) annotation).defaultPath();
            break;
        }
    }
    return String.format("%s %s", propertyUtils.getProperty("main.site.url"), annotationValue);
}
}
