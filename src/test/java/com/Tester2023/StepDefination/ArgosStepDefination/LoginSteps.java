package com.Tester2023.StepDefination.ArgosStepDefination;

import com.Tester2023.PageObject.ArgosPageObject.Login;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

    Login obj = new Login();

    @Given("user click on the Account Button")
    public void user_click_on_the_account_button() {
        obj.accountButton();
    }

    @When("user is on sign in page")
    public void user_is_on_sign_in_page() {
        obj.accountLoginPage();
    }

    @And("user provide the email {string}")
    public void userProvideTheEmail(String Username) {
        obj.emailAddress(Username);
    }

    @And("user provide the password {string}")
    public void userProvideThePassword(String Password) {
        obj.currentPassword(Password);
    }

    @Then("user able to sing in successfully")
    public void user_able_to_sing_in_successfully() {
        obj.signInSecurely();
    }
}
