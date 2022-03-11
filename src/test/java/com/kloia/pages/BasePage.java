package com.kloia.pages;

import com.kloia.utilities.BrowserUtils;
import com.kloia.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    BasePage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath = "//span[contains(.,'Account')]")
    public WebElement accountDropdown;

    @FindBy(xpath = "//span[contains(.,'Hi,')]")
    public WebElement userDropdown;

    @FindBy(xpath = "//a[contains(.,'Sign In')]")
    public WebElement signInButton;

    @FindBy(xpath = "//nav[contains(.,'Menu')]")
    public WebElement menuDropdown;

    @FindBy(id = "brand_facet-search-bar-input")
    public WebElement brandInputBox;

    @FindBy(xpath = "//span[contains(.,'Saved Items')]")
    public WebElement savedItemsButton;

    public void navigateToSignInPage(){
        accountDropdown.click();
        signInButton.click();
    }

    public boolean verifySuccessfulLogin(){
        return (userDropdown.getText().contains("Hi,"));
    }

    public void selectProduct(String submenu3, String submenu1, String submenu2){
        menuDropdown.click();
        String submenu1Path = "//button[contains(.,'" + submenu1 + "')]";
        String submenu2Path = "//button[contains(.,'" + submenu2 + "')]";
        String submenu3Path = "//*[text() = '" + submenu3 + "']";
        BrowserUtils.waitFor(1);
        Driver.get().findElement(By.xpath(submenu1Path)).click();
        BrowserUtils.waitFor(1);
        Driver.get().findElement(By.xpath(submenu2Path)).click();
        BrowserUtils.waitFor(1);
        Driver.get().findElement(By.xpath(submenu3Path)).click();
    }

    public void selectBrand(String brand){
        BrowserUtils.waitFor(2);
        brandInputBox.sendKeys(brand, Keys.ARROW_DOWN, Keys.ENTER);
    }

    public void selectNthProduct(String n){
        BrowserUtils.waitFor(2);
        String path = "//ol[@class]/li[3]//a/img";
        Driver.get().findElement(By.xpath(path)).click();
    }

    public void clickSavedItemButton(){
        BrowserUtils.waitFor(2);
        savedItemsButton.click();
    }

}
