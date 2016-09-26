import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.EmailPage;
import pages.MainPage;

import java.util.concurrent.TimeUnit;

public class InboxLettersTest {
    private static final String DEFAULT_URL = "http://www.tut.by";
    private static final String LOGIN = "Irinatest1";
    private static final String PASSWORD = "12345_irina";

    private WebDriver driver;

    @BeforeMethod
    public void setup() {
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.manage().timeouts().setScriptTimeout(10, TimeUnit.SECONDS);
        driver.get(DEFAULT_URL);
    }

    @Test
    public void checkInboxLetters()  {
        MainPage mainPage = new MainPage(driver);
        mainPage.login(LOGIN, PASSWORD);
        EmailPage emailPage = mainPage.goToMail();
        Assert.assertTrue(emailPage.isAmountInboxMailDisplayed(), "The amount Inbox Letters didn't display!");
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}


