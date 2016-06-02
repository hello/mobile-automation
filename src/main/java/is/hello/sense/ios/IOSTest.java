package is.hello.sense.ios;

import com.saucelabs.common.SauceOnDemandSessionIdProvider;
import io.appium.java_client.TouchAction;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.remote.MobileCapabilityType;
import is.hello.sense.SenseSauceOnDemandSessionIdProvider;
import org.junit.*;
import org.junit.rules.TestName;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

import static junit.framework.TestCase.assertNotNull;

public class IOSTest extends IOSSenseSauceOnDemandSessionIdProvider {
    private IOSDriver driver;
    private String sessionId;


    public String getSessionId() {
        return sessionId;
    }

    public
    @Rule
    TestName name = new TestName();

    @Before
    public void setUp() throws MalformedURLException {
        System.out.println("Sauce URL: "+getSauceUrL());
        driver = new IOSDriver(getSauceUrL(), getCapabilities() );
        sessionId = driver.getSessionId().toString();
    }

    @After
    public void tearDown() {
        System.out.println("Link to your job: https://saucelabs.com/jobs/" + this.getSessionId());
        driver.quit();
    }

    //todo remove this method when fullreset works.
    private void logOutIfLoggedIn() throws InterruptedException {
        IOSElement drawerButton = null;
        try {
            Thread.sleep(2000);
             drawerButton = (IOSElement) driver.findElement(By.xpath("//UIAButton[contains(@name,'Drawer')]"));
            drawerButton.tap(1,2);
        } catch (NoSuchElementException e) {
            return;
        }catch (WebDriverException e){
            if (drawerButton!= null) {
                drawerButton.click();
            }
        }

        IOSElement settingsButton = (IOSElement) driver.findElement(By.xpath("//UIAButton[contains(@name,'Settings')]"));
        assertNotNull(settingsButton); // your apps broken.
        settingsButton.click();


        IOSElement myAccountText = (IOSElement) driver.findElement(By.xpath("//UIATableCell [contains(@name,'My account')]"));
        assertNotNull(myAccountText);
        myAccountText.click();

        IOSElement signOutText = (IOSElement) driver.findElement(By.xpath("//UIATableCell [contains(@name,'Sign out')]"));
        assertNotNull(signOutText);
        signOutText.click();

        IOSElement yesText = (IOSElement) driver.findElement(By.xpath("//UIAButton  [contains(@name,'YES')]"));
        assertNotNull(yesText);
        yesText.click();
    }

    @Test
    public void testLoginForMobileDev() throws InterruptedException {
        logOutIfLoggedIn();

        IOSElement loginButton = (IOSElement) driver.findElement(By.xpath("//UIAButton[contains(@name,'LOG IN')]"));
        assertNotNull(loginButton);
        loginButton.click();

        IOSElement emailInput = (IOSElement) driver.findElement(By.xpath("//UIATextField [contains(@value,'Email')]"));
        assertNotNull(emailInput);
        emailInput.click();
        emailInput.sendKeys("mobile+dev@sayhello.com");

        IOSElement passwordInput = (IOSElement) driver.findElement(By.xpath("//UIASecureTextField [contains(@value,'Password')]"));
        assertNotNull(passwordInput);
        passwordInput.click();
        passwordInput.sendKeys("test123");
        driver.hideKeyboard();

        IOSElement loginButton2 = (IOSElement) driver.findElement(By.xpath("//UIAButton[contains(@name,'LOG IN')]"));
        assertNotNull(loginButton2);
        loginButton2.click();
    }

}