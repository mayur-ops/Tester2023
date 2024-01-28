package com.Tester2023;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
//@CucumberOptions(features = "src/test/Resource/ArgosHomePage.feature", tags = "@ShopButton")
//@CucumberOptions(features = "src/test/Resource/ArgosHomePage.feature", tags = "@Clearance")
@CucumberOptions(features = "src/test/Resource/ArgosHomePage.feature", tags = "@Clearance",
        plugin = {"pretty", "html:target/cucumber-html-report",
                "json:target/cucumber-json-report.json",
                "junit:target/cucumber-xml-report.xml",
                "pretty:target/cucumber-pretty-report.txt"})
//@CucumberOptions(features = "src/test/Resource/LidlHomePage.feature", tags = "@Halloween")

public class RunCuckTest {

}
