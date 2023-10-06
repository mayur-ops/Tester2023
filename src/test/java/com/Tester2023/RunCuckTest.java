package com.Tester2023;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
//@CucumberOptions(features = "src/test/Resource/ArgosHomePage.feature", tags = "@ShopButton")
//@CucumberOptions(features = "src/test/Resource/ArgosHomePage.feature", tags = "@Clearance")
@CucumberOptions(features = "src/test/Resource/ArgosHomePage.feature", tags = "@SignIn")
//@CucumberOptions(features = "src/test/Resource/LidlHomePage.feature", tags = "@Halloween")

public class RunCuckTest {

}
