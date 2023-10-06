package com.Tester2023.StepDefination.LidlStepDefination;

import com.Tester2023.PageObject.LidlPageObject.Halloween;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HalloweenSteps {

    Halloween obj = new Halloween();

    @Given("user is on Lidl home page")
    public void user_is_on_lidl_home_page() {
        obj.lidlHomePage();
    }

    @Given("user click on the halloween button")
    public void user_click_on_the_halloween_button() {
        obj.halloweenButton();
    }

    @Given("user able to see all halloween related products")
    public void user_able_to_see_all_halloween_related_products() {
        obj.HalloweenProductsHomePage();
    }

    @When("user click on the pumpkins product")
    public void user_click_on_the_pumpkins_product() throws InterruptedException {
        obj.Pumpkins();
    }

    @When("user able to see all pumpkins products")
    public void user_able_to_see_all_pumpkins_products() {
        obj.pumpkinsHomePage();
    }

    @Then("user click on large pumpkins")
    public void user_click_on_large_pumpkins() {
        obj.LargePumpkins();
    }
}
