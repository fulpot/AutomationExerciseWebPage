package com.automationExercise.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountCreatedPage extends BasePage{

    @FindBy(css = "#form b")
    public WebElement accountCreatedMessage;

    @FindBy(css = "a[data-qa='continue-button']")
    public WebElement continueButton;
}
