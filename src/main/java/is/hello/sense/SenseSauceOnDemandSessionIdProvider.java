package is.hello.sense;

import com.saucelabs.common.SauceOnDemandSessionIdProvider;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import is.hello.sense.android.AndroidMain;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public abstract class SenseSauceOnDemandSessionIdProvider implements SauceOnDemandSessionIdProvider {
    protected abstract DesiredCapabilities getCapabilities();

    protected abstract  URL getSauceUrL() throws MalformedURLException;


    protected void printPage(AppiumDriver driver) {
        System.out.println(driver.getPageSource());
    }

    protected void waitASec() throws InterruptedException {
        Thread.sleep(1000);

    }

    public String getSessionId() {
        return null;
    }
}
