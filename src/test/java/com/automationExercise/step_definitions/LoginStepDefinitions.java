package com.automationExercise.step_definitions;

import com.automationExercise.page.BasePage;
import com.automationExercise.page.LoginSignupPage;
import com.automationExercise.page.ProfileHomepagePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class LoginStepDefinitions {

    private static final Logger log = LoggerFactory.getLogger(LoginStepDefinitions.class);
    LoginSignupPage loginSignupPage = new LoginSignupPage();
    ProfileHomepagePage profileHomepagePage = new ProfileHomepagePage();

//    @When("The user {string} and {string} as email and password")
//    public void the_user_and_as_email_and_password(String email, String password) {
//        loginSignupPage.emailInputForLogin.sendKeys(email);
//        loginSignupPage.passwordInputForLogin.sendKeys(password);
//    }

    @When("The user clicks Login button to login")
    public void the_user_clicks_login_button_to_login() {
        loginSignupPage.loginButton.click();
    }

    @Then("Verify that Logout button is visible und clickable")
    public void verify_that_logout_button_is_visible_und_clickable() {
        Assert.assertTrue(profileHomepagePage.logoutButton.isDisplayed());
        Assert.assertTrue(profileHomepagePage.logoutButton.isEnabled());
    }

    @Then("Verify to be displayed {string} warning message Email Address input box")
    public void verify_to_be_displayed_warning_message_email_address_input_box(String expectedMessage) {
       Assert.assertEquals(expectedMessage,loginSignupPage.emailInputForLogin.getAttribute("validationMessage"));
    }

    @When("The user enters {string} as email for login")
    public void the_user_enters_as_email_for_login(String email) {
        loginSignupPage.emailInputForLogin.sendKeys(email);
    }
    @Then("Verify to be displayed {string} warning message Password input box")
    public void verify_to_be_displayed_warning_message_password_input_box(String expectedMessage) {
        Assert.assertEquals(expectedMessage,loginSignupPage.passwordInputForLogin.getAttribute("validationMessage"));
    }

    @When("The user enters {string} as password")
    public void the_user_enters_and_as_password(String password) {
        loginSignupPage.passwordInputForLogin.sendKeys(password);
    }

    @Then("Verify error {string} is visible")
    public void verify_error_is_visible(String expected) {
        Assert.assertEquals(expected, loginSignupPage.incorrectEmailOrPasswordMessage.getText());
    }
}
