package com.automationExercise.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactUsPage extends BasePage{

    @FindBy(css = "input[data-qa='name']")
    public WebElement nameInput;

    @FindBy(css = "input[data-qa='email']")
    public WebElement emailInput;

    @FindBy(css = "input[data-qa='subject']")
    public WebElement subjectInput;

    @FindBy(css = "textarea#message")
    public WebElement messageInput;

    @FindBy(css = "input[type='file']")
    public WebElement chooseFileButton;

    @FindBy(css = "input[data-qa='submit-button']")
    public WebElement submitButton;

    @FindBy(xpath = "//h2[.='Get In Touch']")
    public WebElement gettingTouchText;

    @FindBy(css =".status.alert.alert-success")
    public WebElement successMessage;

    @FindBy(css = "span > i")
    public WebElement homeButton;

}
