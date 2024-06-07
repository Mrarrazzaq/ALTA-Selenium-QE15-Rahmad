package org.example.pageObject;

import org.example.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;


public class SearchAddRemoveProduct extends BasePage {
    public SearchAddRemoveProduct(WebDriver driver) {
        super(driver);
    }
    @FindBy(className = "product_sort_container")
    private WebElement sortDropdown;
    @FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-onesie']")
    private WebElement btnAddToCartSauceLabsOnesie;
    @FindBy(xpath = "//button[@id='add-to-cart-test.allthethings()-t-shirt-(red)']")
    private WebElement btnAddToCartRedTShirt;
    @FindBy (id = "item_3_title_link")
    private WebElement tittleProductAllTheThingsTShirtRed;
    @FindBy (id = "item_2_title_link")
    private WebElement tittleProductSauceLabsOnesie;
    @FindBy(className = "shopping_cart_link")
    private WebElement cart;
    @FindBy(id = "remove-test.allthethings()-t-shirt-(red)")
    private WebElement btnRemoveRedTShirt;
    @FindBy(id = "continue-shopping")
    private WebElement btnContinueShopping;



    // Metode untuk memilih opsi dari dropdown
    public void selectSortDropdown(String value) {
        selectByVisibleText(sortDropdown, value);
    }
    public void clickAddToCartSauceLabsOnsie() {
        scrollIntoView(btnAddToCartSauceLabsOnesie);
        waitForElementClickable(btnAddToCartSauceLabsOnesie);
        click(btnAddToCartSauceLabsOnesie);
    }
    public void clickAddToCartSauceLabsRedTsirt() {
        scrollIntoView(btnAddToCartRedTShirt);
        waitForElementClickable(btnAddToCartRedTShirt);
        click(btnAddToCartRedTShirt);
    }
    public void clickCart() {
        waitForElementClickable(cart);
        click(cart);
    }
    public boolean verifyProductAllTheThingsTShirtRed(){

        return isDisplayed(tittleProductAllTheThingsTShirtRed);
    }
    public boolean verifyProductSauceLabsOneSie(){

        return isDisplayed(tittleProductSauceLabsOnesie);
    }
    public void clickRemoveRedTShirt() {
        scrollIntoView(btnRemoveRedTShirt);
        waitForElementClickable(btnRemoveRedTShirt);
        click(btnRemoveRedTShirt);
    }
    public void clickContinueShopping() {
        scrollIntoView(btnContinueShopping);
        waitForElementClickable(btnContinueShopping);
        click(btnContinueShopping);
    }

}
