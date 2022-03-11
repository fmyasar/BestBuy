package com.kloia.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends BasePage{

    @FindBy(className = "search-title")
    public WebElement resultText;

    public String getResultText(){
        System.out.println("resultText.getText() = " + resultText.getText());
        return resultText.getText();
    }

}
