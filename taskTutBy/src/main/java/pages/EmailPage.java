package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static helper.Locators.get;


public class EmailPage {
    private static final By AMOUNT_INBOX_MAIL = get("EmailPage.AmountInboxMail");

    private final WebDriver driver;

    public EmailPage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isAmountInboxMailDisplayed() {
        WebElement amountInboxMail;
        try {
            amountInboxMail = driver.findElement(AMOUNT_INBOX_MAIL);
        } catch (NoSuchElementException ex) {
            return false;
        }
        return amountInboxMail.isDisplayed();
    }
}
