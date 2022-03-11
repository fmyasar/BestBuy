package com.kloia.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

    @FindBy(id = "gh-search-input")
    public WebElement searchBox;

    @FindBy(xpath = "//button[@title='submit search']")
    public WebElement searchButton;

    public void searchItem(String itemName){;
        searchBox.sendKeys(itemName.toLowerCase());
        searchButton.click();
    }



}
