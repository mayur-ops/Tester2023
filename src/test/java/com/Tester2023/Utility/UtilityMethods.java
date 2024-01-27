package com.Tester2023.Utility;

import com.Tester2023.BaseClassPackage.DriverFactory;
import org.hamcrest.Matchers;
import org.junit.Assert;

public class UtilityMethods extends DriverFactory {


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
}
