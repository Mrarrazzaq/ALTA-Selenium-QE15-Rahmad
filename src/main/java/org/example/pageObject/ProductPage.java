package org.example.pageObject;

import org.example.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;


public class ProductPage extends BasePage {
    public ProductPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//a[@id='item_4_title_link']")
    private WebElement titleProductSauceLabsBackpack;
    @FindBy(id = "remove-sauce-labs-backpack")
    private WebElement btnRemoveSauceLabsBackpack;
    @FindBy(id = "add-to-cart-sauce-labs-backpack")
    private WebElement btnAddToCardSauceLabsBackpack;
    @FindBy(id = "shopping_cart_container")
    private WebElement cart;

    @FindBy(className = "product_sort_container")
    private WebElement sortDropdown;

    @FindBy(className = "inventory_item_name")
    private List<WebElement> productNames;

    @FindBy(id = "continue-shopping")
    private WebElement btnContinueShopping;

    @FindBy(id = "add-to-cart-sauce-labs-onesie")
    private WebElement btnAddToCartSauceLabsOnesie;

    @FindBy(id = "add-to-cart-test.allthethings()-t-shirt-(red)")
    private WebElement btnAddToCartRedTShirt;

    @FindBy(id = "remove-test.allthethings()-t-shirt-(red)")
    private WebElement btnRemoveRedTShirt;

    public boolean verifyTitleProductSauceLabsBackpack(){
        return isDisplayed(titleProductSauceLabsBackpack);
    }
    public boolean verifyRemoveButtonDisplayedOnTheProductSauceLabsBackpack(){
        return isDisplayed(btnRemoveSauceLabsBackpack);
    }
    public void clickRemoveProductSauceLabBackpack(){
        scrollIntoView(btnRemoveSauceLabsBackpack);
        waitForElementClickable(btnRemoveSauceLabsBackpack);
        click(btnRemoveSauceLabsBackpack);
    }
    public boolean verifyAddToCartSauceLabsBackpack(){
        return isDisplayed(btnAddToCardSauceLabsBackpack);
    }
    public void clickAddToCartSauceLabsBackpack(){
        scrollIntoView(btnAddToCardSauceLabsBackpack);
        waitForElementClickable(btnAddToCardSauceLabsBackpack);
        click(btnAddToCardSauceLabsBackpack);
    }
    public void clickCart(){
        waitForElementClickable(cart);
        click(cart);
    }
    public void selectSortDropdown(String value) {
        selectByVisibleText(sortDropdown, value);
    }

    public void clickContinueShopping() {
        click(btnContinueShopping);
    }

    public void clickAddToCartSauceLabsOnesie() {
        click(btnAddToCartSauceLabsOnesie);
    }

    public void clickAddToCartRedTShirt() {
        click(btnAddToCartRedTShirt);
    }

    public void clickRemoveRedTShirt() {
        click(btnRemoveRedTShirt);
    }

}
