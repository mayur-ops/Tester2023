package com.Tester2023.StepDefination.ArgosStepDefination;

import com.Tester2023.PageObject.ArgosPageObject.Clearance;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ClearanceSteps {

    Clearance obj = new Clearance();

    @Given("user able to click argos icon")
    public void user_able_to_click_argos_icon() {
        obj.argosLogo();
    }

    @Given("user able to click on the clearance button")
    public void user_able_to_click_on_the_clearance_button() {
        obj.clearanceLogo();
    }

    @When("user click on the clothing button")
    public void user_click_on_the_clothing_button() {
        obj.clothingButtonn();
    }

    @When("user should able to see all clothing related products")
    public void user_should_able_to_see_all_clothing_related_products() {
        obj.clothingPageDisplay();
    }

    @When("user click on the men's sale button")
    public void user_click_on_the_men_s_sale_button() {
        obj.menSaleLogo();
    }

    @When("user is on men's sale clothing items")
    public void user_is_on_men_s_sale_clothing_items() {
        obj.menSaleClothingPage();
    }

    @When("user click £{int}-£{int} check box")
    public void user_click_£_£_check_box(Integer int1, Integer int2) {
        obj.menCheckBoxButton();
    }

    @When("user should able to see all between £{int}-£{int} range products")
    public void user_should_able_to_see_all_between_£_£_range_products(Integer int1, Integer int2) {
        obj.getURLOfCheckBox();
    }

    @Then("user able to click on gray denim shoes")
    public void user_able_to_click_on_gray_denim_shoes() throws InterruptedException {
        obj.grayDenimShoes();
    }

    @And("use select the size of the product")
    public void useSelectTheSizeOfTheProduct() throws InterruptedException {
        obj.sizeSelect();
    }

    @Then("user add to trolley")
    public void user_add_to_trolley() {
        obj.addToTrolley();
    }
}
