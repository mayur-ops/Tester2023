package com.Tester2023.StepDefination.ArgosStepDefination;

import com.Tester2023.PageObject.ArgosPageObject.ShopButton;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ShopButtonSteps {

    ShopButton obj = new ShopButton();

    @Given("user is on argos home page")
    public void user_is_on_argos_home_page() {
        obj.argosHomePage();
    }

    @When("user hover over the Shop button")
    public void user_hover_over_the_shop_button(){
        obj.hoverShopButton();
    }

    @When("user can see another window open and hover over the Techanology")
    public void user_can_see_another_window_open_and_hover_over_the_techanology(){
        obj.hoverTechnology();
    }

    @When("user able to click on the televisions")
    public void user_able_to_click_on_the_televisions() {
        obj.televisionButton();
    }

    @Then("user should able to see all television related products")
    public void user_should_able_to_see_all_television_related_products() {
        obj.TelevisionAssertion();
    }
}
