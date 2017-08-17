package core.hotline.page_object.homepage.Common.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by HillelMono7 on 8/17/2017.
 */
//В какой момент времени доступна аннотация. runtime - в реальном времени
@Retention(RetentionPolicy.RUNTIME)
//може применятся
@Target(ElementType.TYPE)

public @interface DefaultPath {

    //public String defaultPath = null;
    String DefaultPath();


}
