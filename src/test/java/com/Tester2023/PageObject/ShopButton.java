package com.Tester2023.PageObject;

import com.Tester2023.BaseClassPackage.DriverFactory;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ShopButton extends DriverFactory {


    public void argosHomePage() {
        String argosHomePageURL = driver.getCurrentUrl();
        System.out.println(argosHomePageURL);
    }

    @FindBy(xpath = "//header/div[3]/div[1]/nav[1]/div[1]/ul[1]/li[1]/a[1]/span[1]")
    WebElement ShopButton;

    public void hoverShopButton(){
        ShopButton.click();
    }

    @FindBy(css = "._1Ce4i._2eUXm ")
    List<WebElement> TechnologyButtons;

    public void hoverTechnology(){

        for (WebElement TechnologyButton : TechnologyButtons) {
            System.out.println(TechnologyButton.getText());
            if (TechnologyButton.getText().contains("Technology")) {
                TechnologyButton.click();
                break;
            }
        }
    }

    @FindBy(linkText = "Televisions and accessories")
    WebElement TelevisionButton;

    public void televisionButton() {
        TelevisionButton.click();
    }

    public void TelevisionAssertion() {
        String actualURL = driver.getCurrentUrl();
        System.out.println(actualURL);
        Assert.assertThat(actualURL, Matchers.containsString("https://www.argos.co.uk/browse/technology/televisions-and-accessories/c:29955/"));
    }

}
