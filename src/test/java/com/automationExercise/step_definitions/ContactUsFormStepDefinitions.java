package com.automationExercise.step_definitions;

import com.automationExercise.page.ContactUsPage;
import com.automationExercise.page.HomePage;
import com.automationExercise.utilities.BrowserUtils;
import com.automationExercise.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Alert;

import static org.junit.Assert.assertTrue;

public class ContactUsFormStepDefinitions {

    HomePage homePage = new HomePage();
    ContactUsPage contactUsPage = new ContactUsPage();

    @When("Click on Contact Us button")
    public void click_on_button() {
        homePage.contactUsButton.click();
    }
    @Then("Verify {string} is visible")
    public void verify_is_visible(String expectedMessage) {
        Assert.assertTrue(contactUsPage.gettingTouchText.isDisplayed());
        Assert.assertEquals(expectedMessage, contactUsPage.gettingTouchText.getText());
    }
    @When("Enter {string}, {string}, {string} and {string}")
    public void enter_and(String name, String email, String subject, String message) {
        contactUsPage.nameInput.sendKeys(name);
        contactUsPage.emailInput.sendKeys(email);
        contactUsPage.subjectInput.sendKeys(subject);
        contactUsPage.messageInput.sendKeys(message);
    }
    @When("Upload file")
    public void upload_file() {
        String projectPath = System.getProperty("user.dir");
        String filePath = "src/test/resources/uploads/info.csv";
        contactUsPage.chooseFileButton.sendKeys(projectPath + "/" + filePath);
    }
    @When("Click Submit button")
    public void click_button() {
        contactUsPage.submitButton.submit();
    }
    @When("Click OK button")
    public void click_ok_button() {
        Alert alert = Driver.get().switchTo().alert();
        alert.accept();
    }
    @Then("Verify success message {string} is visible")
    public void verify_success_message_is_visible(String expectedMessage) {
        Assert.assertEquals(expectedMessage, contactUsPage.successMessage.getText());
    }
    @Then("Click Home button and verify that landed to home page successfully")
    public void click_button_and_verify_that_landed_to_home_page_successfully() {
        contactUsPage.homeButton.click();
        Assert.assertEquals("Automation Exercise", Driver.get().getTitle());
    }
}
