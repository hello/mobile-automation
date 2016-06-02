package is.hello.sense.android;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;

import java.net.MalformedURLException;

import static junit.framework.TestCase.assertNotNull;


public class AndroidTest extends AndroidSenseSauceOnDemandSessionIdProvider {
    private AndroidDriver driver;
    private String sessionId;

    public AndroidTest() {

    }

    public String getSessionId() {
        return sessionId;
    }

    public
    @Rule
    TestName name = new TestName();

    @Before
    public void setUp() throws MalformedURLException {
        System.out.println("Sauce URL: "+getSauceUrL());
        driver = new AndroidDriver(getSauceUrL(), getCapabilities());
        sessionId = driver.getSessionId().toString();
    }

    @After
    public void tearDown() {
        System.out.println("Link to your job: https://saucelabs.com/jobs/" + this.getSessionId());
        driver.quit();
    }

    //todo remove this method when fullreset works.
    private void logOutIfLoggedIn() throws InterruptedException {
        try {
            AndroidElement drawerButton = (AndroidElement) driver.findElement(new By.ById("is.hello.sense.debug:id/view_timeline_toolbar_overflow"));
            drawerButton.click();
        } catch (NoSuchElementException e) {
            return;
        }
        waitASec();

        AndroidElement settingsButton = (AndroidElement) driver.findElement(By.xpath("//android.widget.ToggleButton[@index='4']"));
        assertNotNull(settingsButton); // your apps broken.
        settingsButton.click();
        waitASec();

        AndroidElement myAccountText = (AndroidElement) driver.findElement(new By.ById("is.hello.sense.debug:id/fragment_app_settings_account"));
        assertNotNull(myAccountText);
        myAccountText.click();
        waitASec();
        driver.scrollTo("Sign Out");
        //android.widget.RadioButton[@text='Use Testdroid Cloud']
//        AndroidElement signOutText = (AndroidElement) driver.findElement(By.xpath("//android.widget.RelativeLayout[@index='8']"));
        AndroidElement signOutText = (AndroidElement) driver.findElement(By.xpath("//android.widget.TextView[@text='Sign Out']"));
        assertNotNull(signOutText);
        signOutText.click();
        waitASec();


        AndroidElement yesText = (AndroidElement) driver.findElement(new By.ById("is.hello.sense.debug:id/dialog_sense_alert_ok"));
        assertNotNull(yesText);
        yesText.click();
        waitASec();


    }

    @Test
    public void testLoginForMobileDev() throws InterruptedException {
        logOutIfLoggedIn();
        AndroidElement loginButton = (AndroidElement) driver.findElement(new By.ById("is.hello.sense.debug:id/fragment_onboarding_introduction_sign_in"));
        assertNotNull(loginButton);
        loginButton.click();
        waitASec();

        AndroidElement emailInput = (AndroidElement) driver.findElement(new By.ById("is.hello.sense.debug:id/fragment_onboarding_email"));
        assertNotNull(emailInput);
        emailInput.click();
        emailInput.sendKeys("mobile+dev@sayhello.com");

        AndroidElement passwordInput = (AndroidElement) driver.findElement(new By.ById("is.hello.sense.debug:id/fragment_onboarding_password"));
        assertNotNull(passwordInput);
        passwordInput.click();
        passwordInput.sendKeys("test123");
        driver.hideKeyboard();

        AndroidElement loginButton2 = (AndroidElement) driver.findElement(new By.ById("is.hello.sense.debug:id/fragment_onboarding_sign_in_go"));
        assertNotNull(loginButton2);
        loginButton2.click();
        Thread.sleep(10000);


    }

}