package is.hello.sense.android;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import is.hello.sense.SenseSauceOnDemandSessionIdProvider;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public abstract class AndroidSenseSauceOnDemandSessionIdProvider extends SenseSauceOnDemandSessionIdProvider {

    @Override
    protected DesiredCapabilities getCapabilities() {
        System.out.println("Android { IPAddress: " + AndroidMain.ipAddress + ", Port: " + AndroidMain.port + ", DeviceName: " + AndroidMain.deviceName + " }");
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, AndroidMain.deviceName);
        desiredCapabilities.setCapability(MobileCapabilityType.UDID, AndroidMain.UDID);
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "android");
        desiredCapabilities.setCapability(MobileCapabilityType.APP, "/Users/david/Documents/Hello/MobileAppiumTesting/src/main/resources/app-debug.apk");
        desiredCapabilities.setCapability("appiumVersion", "1.5.2");
        desiredCapabilities.setCapability(MobileCapabilityType.NO_RESET, true);
        //desiredCapabilities.setCapability(MobileCapabilityType.FULL_RESET, true); //todo currently bugged. Add back when fixed.
        return desiredCapabilities;

    }

    @Override
    protected URL getSauceUrL() throws MalformedURLException {
        return new URL("http://" + AndroidMain.ipAddress + ":" + AndroidMain.port + "/wd/hub");
    }
}
