package com.automationExercise.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignupPage extends BasePage{

    @FindBy(id = "id_gender1")
    public WebElement genderMaleRadioButton;

    @FindBy(id = "id_gender2")
    public WebElement genderFrauRadioButton;

    @FindBy(id = "name")
    public WebElement nameInput;

    @FindBy(id = "email")
    public WebElement emailInput;

    @FindBy(id = "password")
    public WebElement passwordInput;

    @FindBy(id = "days")
    public WebElement daySelect;

    @FindBy(id = "months")
    public WebElement monthSelect;

    @FindBy(id = "years")
    public WebElement yearSelect;

    @FindBy(id = "newsletter")
    public WebElement newsletterCheckbox;

    @FindBy(id = "optin")
    public WebElement specialOfferCheckbox;

    @FindBy(id = "first_name")
    public WebElement firstNameInput;

    @FindBy(id = "last_name")
    public WebElement lastNameInput;

    @FindBy(id = "company")
    public WebElement companyInput;

    @FindBy(id = "address1")
    public WebElement address1Input;

    @FindBy(id = "address2")
    public WebElement address2Input;

    @FindBy(id = "country")
    public WebElement countrySelect;

    @FindBy(id = "state")
    public WebElement stateInput;

    @FindBy(id = "city")
    public WebElement cityInput;

    @FindBy(id = "zipcode")
    public WebElement zipcodeInput;

    @FindBy(id = "mobile_number")
    public WebElement mobilNumberInput;

    @FindBy(css = "button[data-qa='create-account']")
    public WebElement createAccountButton;










}
