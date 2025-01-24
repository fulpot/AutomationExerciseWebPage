package com.automationExercise.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class TestCasesPage extends BasePage {

    @FindBy(xpath = "//b")
    public WebElement testCasesHeader;

    @FindBy(css = "a[data-toggle='collapse'][href^='#collapse']")
    public List<WebElement> testCasesElements;

}
