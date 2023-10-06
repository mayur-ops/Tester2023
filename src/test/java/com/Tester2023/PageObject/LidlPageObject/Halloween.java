package com.Tester2023.PageObject.LidlPageObject;

import com.Tester2023.BaseClassPackage.DriverFactory;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class Halloween extends DriverFactory {

    public void lidlHomePage() {
        String ActualLidlUrl = driver.getCurrentUrl();
        System.out.println(ActualLidlUrl);
        Assert.assertEquals(ActualLidlUrl, "https://www.lidl.co.uk/");
    }

    @FindBy(linkText = "Halloween")
    WebElement HalloweenButtons;

    public void halloweenButton() {
        HalloweenButtons.click();
    }

    public void HalloweenProductsHomePage() {
        String ActuaUrl = driver.getCurrentUrl();
        System.out.println(ActuaUrl);
        Assert.assertEquals(ActuaUrl, "https://www.lidl.co.uk/c/halloween/s10026897");
    }

    @FindBy(css = ".ATheContentPageCardList.ATheContentPageCardList--WrapAtSM")
    List<WebElement> Pumpkins;

    public void Pumpkins() throws InterruptedException {
        for (WebElement Pumpkin : Pumpkins) {
            System.out.println(Pumpkin.getText());
            Thread.sleep(200);
            if (Pumpkin.getText().equalsIgnoreCase("Pumpkins")) {
                Pumpkin.click();
            }
        }
    }

    public void pumpkinsHomePage() {
        String ActuaUrl = driver.getCurrentUrl();
        System.out.println(ActuaUrl);
        Assert.assertEquals(ActuaUrl, "https://www.lidl.co.uk/c/halloween/s10026897");
    }

   // @FindBy(css = ".ATheContentPageCard__Claim")
   @FindBy(css = ".ATheCampaign__Section.ATheCampaign__Section--10121929")
    List<WebElement> LargePumpkins;

    public void LargePumpkins() {
        for (WebElement LargPumpkin : LargePumpkins) {
            System.out.println(LargPumpkin.getText());
            if (LargPumpkin.getText().contains("Large Pumpkin")) {
                LargPumpkin.click();
            }
        }
    }
}
