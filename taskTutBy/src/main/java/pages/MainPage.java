package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static helper.Locators.get;

public class MainPage {
    private static final By LOGIN_BUTTON = get("MainPage.LoginButton");
    private static final By LOGIN_INPUT = get("MainPage.LoginInput");
    private static final By PASSWORD_INPUT = get("MainPage.PasswordInput");
    private static final By ENTER_BUTTON = get("MainPage.EnterButton");
    private static final By MAIL_BUTTON = get("MainPage.MailButton");

    private final WebDriver driver;

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    public void login(String login, String password) {
        driver.findElement(LOGIN_BUTTON).click();

        driver.findElement(LOGIN_INPUT).sendKeys(login);
        driver.findElement(PASSWORD_INPUT).sendKeys(password);
        driver.findElement(ENTER_BUTTON).click();
    }

    public EmailPage goToMail() {
        driver.findElement(MAIL_BUTTON).click();
        return new EmailPage(driver);
    }

}
