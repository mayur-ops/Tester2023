package com.Tester2023.StepDefination.ArgosStepDefination;

import com.Tester2023.PageObject.ArgosPageObject.TechnologyButton;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class TechnologyButtonSteps {

    TechnologyButton obj = new TechnologyButton();

    @Given("User click on the technology button")
    public void user_click_on_the_technology_button() {
     obj.technologyButton();
    }

    @When("User click on the Printers")
    public void user_click_on_the_printers() {
   obj.techProduct();

    }
    @And("User able to see all Printer items")
    public void user_able_to_see_all_printer_items() {
    obj.titleOfThePage();
    }

    @And("User select the HP checkbox to see HP products")
    public void userSelectTheHPCheckboxToSeeHPProducts() {
    obj.checkBoxOfHP();
    obj.getCurrentURL();
    }
}
