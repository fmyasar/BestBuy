package com.kloia.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductDetailPage extends BasePage{

    @FindBy(xpath = "//button[@class='save-for-later-save']")
    public WebElement saveButton;

    @FindBy(xpath = "//div[@class='sku-title']/h1")
    public WebElement selectedProductTitle;

    @FindBy(xpath = "//a[@class='clamp']")
    public WebElement firstSavedItem;

    public void clickSaveButton(){
        saveButton.click();
    }

    public boolean verifyTitleOfSavedItemOnTheList(){
        String expectedTitle = selectedProductTitle.getText();
        String actualTitle = firstSavedItem.getText();
        return expectedTitle.equals(actualTitle);
    }

}
