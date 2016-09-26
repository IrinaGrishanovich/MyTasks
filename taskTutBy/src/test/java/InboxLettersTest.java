import base.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.EmailPage;
import pages.MainPage;

public class InboxLettersTest extends TestBase {

    private static final String LOGIN = "Irinatest1";
    private static final String PASSWORD = "12345_irina";

    @Test
    public void checkInboxLetters()  {
        MainPage mainPage = new MainPage(driver);
        mainPage.login(LOGIN, PASSWORD);
        EmailPage emailPage = mainPage.goToMail();
        Assert.assertTrue(emailPage.isAmountInboxMailDisplayed(), "The amount Inbox Letters didn't display!");
    }
}


