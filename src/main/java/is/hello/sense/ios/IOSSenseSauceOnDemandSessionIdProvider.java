package is.hello.sense.ios;

import io.appium.java_client.remote.MobileCapabilityType;
import is.hello.sense.SenseSauceOnDemandSessionIdProvider;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public abstract class IOSSenseSauceOnDemandSessionIdProvider extends SenseSauceOnDemandSessionIdProvider {

    @Override
    protected DesiredCapabilities getCapabilities() {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, IOSMain.platformVersion);
        desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, IOSMain.deviceName);
        desiredCapabilities.setCapability(MobileCapabilityType.APP, "/Users/david/Documents/Hello/MobileAppiumTesting/src/main/resources/Sense.app");
        desiredCapabilities.setCapability("appiumVersion", "1.5.2");
        desiredCapabilities.setCapability(MobileCapabilityType.UDID, IOSMain.UDID);
        //desiredCapabilities.setCapability(MobileCapabilityType.NO_RESET, false);
        //desiredCapabilities.setCapability(MobileCapabilityType.FULL_RESET, true); //todo currently bugged. Add back when fixed.
        return desiredCapabilities;
    }

    @Override
    protected URL getSauceUrL() throws MalformedURLException {
        return new URL("http://" + IOSMain.ipAddress + ":" + IOSMain.port + "/wd/hub");
    }
}
