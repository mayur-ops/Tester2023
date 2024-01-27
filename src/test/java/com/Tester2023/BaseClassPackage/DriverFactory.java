package com.Tester2023.BaseClassPackage;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class DriverFactory {
    public static WebDriver driver;

    public DriverFactory (){
        PageFactory.initElements(driver,this);
    }

    public void openBrowser(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.argos.co.uk/");
        //driver.get("https://www.lidl.co.uk/");
        driver.manage().window().maximize();
        driver.findElement(By.id("explicit-consent-prompt-accept")).click(); //Argos Cookies
        //driver.findElement(By.id("onetrust-accept-btn-handler")).click();  // Lidl Cookies
    }

    public void closeBrowser(){

        driver.quit();
    }
}
