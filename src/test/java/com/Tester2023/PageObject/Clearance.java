package com.Tester2023.PageObject;

import com.Tester2023.BaseClassPackage.DriverFactory;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class Clearance extends DriverFactory {

    @FindBy(xpath = "//header/div[3]/div[1]/div[1]/a[1]/picture[1]/img[1]")
    WebElement argosLogo;

    public void argosLogo() {
        argosLogo.click();
    }

    @FindBy(xpath = "//body/div[@id='content']/div[1]/div[3]/main[1]/div[2]/div[1]/div[3]/div[1]/div[1]/a[1]/picture[1]/img[1]")
    WebElement clearanceLogo;

    public void clearanceLogo() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,900);");
        clearanceLogo.click();
    }

    @FindBy(xpath = "//body/div[@id='content']/div[1]/div[3]/main[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/a[1]")
    WebElement clothingButton;

    public void clothingButtonn() {
        clothingButton.click();
    }

    public void clothingPageDisplay() {
        String clothingPage = driver.getCurrentUrl();
        System.out.println(clothingPage);
        Assert.assertThat(clothingPage, Matchers.containsString("https://www.argos.co.uk/list/shop-all-tu-clothing-sale/?tag=ar:events:clearance:clothing"));
    }

    @FindBy(xpath = "//body/main[@id='app']/div[1]/div[3]/div[6]/div[1]/div[5]/div[2]/div[1]/div[2]/div[1]/a[2]/picture[1]/img[1]")
    WebElement menSale;

    public void menSaleLogo() {
        menSale.click();
    }

    public void menSaleClothingPage() {
        String menSalePageTitle = driver.getTitle();
        System.out.println(menSalePageTitle);
        Assert.assertEquals(menSalePageTitle, "Results for shop mens tu clothing sale");
    }

    @FindBy(css = ".Checkboxstyles__Label-b61uwr-4.fxNUyK.font-standard")
    List<WebElement> menCheckBoxButtons;

    public void menCheckBoxButton() {
        for (WebElement menCheckBoxButton : menCheckBoxButtons) {
            System.out.println(menCheckBoxButton.getAttribute("value"));
            if (menCheckBoxButton.getAttribute("value").equalsIgnoreCase("£10 - £15")) {
                menCheckBoxButton.click();
                break;
            }
        }
    }

    public void getURLOfCheckBox() {
        String getActualURLOfCheckBox = driver.getCurrentUrl();
        System.out.println(getActualURLOfCheckBox);
        Assert.assertEquals(getActualURLOfCheckBox, "https://www.argos.co.uk/list/shop-mens-tu-clothing-sale/price:%C2%A310-%252D-%C2%A315/");
    }

    @FindBy(css = ".ProductCardstyles__Title-h52kot-12.PQnCV")
    List<WebElement> GrayDenimShoes;

    public void grayDenimShoes() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1500);");

        for (WebElement GrayDenimShoe : GrayDenimShoes) {
            System.out.println(GrayDenimShoe.getText());
            Thread.sleep(2000);
            if (GrayDenimShoe.getText().equalsIgnoreCase("Grey Denim Stretch Laces Shoe")) {
                GrayDenimShoe.click();
                break;

            }
        }
    }

    @FindBy(css = ".TiledSizePickerstyles__Box-sc-1qcyolh-3.hgNvJd")
    List<WebElement> sizes;

    public void sizeSelect() throws InterruptedException {
        Thread.sleep(200);
        for (WebElement size : sizes) {
            System.out.println(size.getAttribute("data-partnumber"));
        }
    }

    @FindBy(css = ".Buttonstyles__Button-sc-42scm2-2.dEQSbW")
    WebElement addToTrolley;

    public void addToTrolley() {
        addToTrolley.click();
    }
}




