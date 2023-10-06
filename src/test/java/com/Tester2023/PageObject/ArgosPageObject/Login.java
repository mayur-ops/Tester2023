package com.Tester2023.PageObject.ArgosPageObject;

import com.Tester2023.BaseClassPackage.DriverFactory;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login extends DriverFactory {

    @FindBy(xpath = "//span[contains(text(),'Account')]")
    WebElement AccountButton;

    public void accountButton() {
        AccountButton.click();
    }


    public void accountLoginPage() {
        String AccountActualURL = driver.getCurrentUrl();
        System.out.println(AccountActualURL);
        Assert.assertEquals(AccountActualURL, "https://www.argos.co.uk/account/login?clickOrigin=header:home:account");
    }

    @FindBy(id = "email-address")
    WebElement email;

    public void emailAddress(String Username) {
        email.sendKeys(Username);
    }

    @FindBy(id = "current-password")
    WebElement password;

    public void currentPassword(String Password) {
        password.sendKeys(Password);
    }

    @FindBy(xpath = "//button[contains(text(),'Sign in securely')]")
    WebElement SignInSecurely;

    public void signInSecurely() {
        SignInSecurely.click();
        String actualURL = driver.getCurrentUrl();
        String actualTitle = driver.getTitle();
        System.out.println(actualTitle);
        Assert.assertEquals(actualTitle,"Sign in | Argos");
        System.out.println(actualURL);
        Assert.assertEquals(actualURL, "https://www.argos.co.uk/account/login?clickOrigin=header:home:account");
    }
}
