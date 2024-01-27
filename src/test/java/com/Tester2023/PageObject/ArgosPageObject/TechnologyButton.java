package com.Tester2023.PageObject.ArgosPageObject;

import com.Tester2023.BaseClassPackage.DriverFactory;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class TechnologyButton extends DriverFactory {

    @FindBy(xpath = "//a[@data-name=\"ev_cmsComponentLoad\"]")
    List<WebElement> TechnologyButtons;

    public void technologyButton (){
        for(WebElement TechnologyButton : TechnologyButtons){
            System.out.println(TechnologyButton.getText());
            if(TechnologyButton.getText().contains("Technology")){
               TechnologyButton.click();
                break;
            }
        }
    }

    @FindBy(xpath = "//li[@data-el=\"category-item\"]")
    List<WebElement> TechProducts;

    public void techProduct (){
        for(WebElement TechProduct : TechProducts){
            System.out.println(TechProduct.getText());
            if(TechProduct.getText().contains("Printers")){
                TechProduct.click();
                break;
            }
        }
    }

    public void titleOfThePage(){
        String WebPageTitle = driver.getTitle();
        System.out.println(WebPageTitle);
        Assert.assertThat(WebPageTitle, Matchers.containsString("Printers | Wireless, Laser & All In One Printers | Argos"));
    }

    public void getCurrentURL(){
        String actualURL = driver.getCurrentUrl();
        System.out.println(actualURL);
        Assert.assertEquals(actualURL,"https://www.argos.co.uk/browse/technology/printers/c:30088/brands:hp/");
    }

    @FindBy(css = ".Checkboxstyles__LabelWrapper-b61uwr-5.dDUgPC")
    List<WebElement> CheckBoxes;

    public void checkBoxOfHP(){
        for(WebElement CheckBox : CheckBoxes){
            System.out.println(CheckBox.getText());
            if(CheckBox.getText().contains("HP")){
                CheckBox.click();
                break;
            }
        }
    }
}
