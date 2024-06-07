package step_definitions;

import hooks.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.example.pageObject.SearchAddRemoveProduct;
import org.openqa.selenium.WebDriver;

public class SearchAddRemoveProductSteps {
    private final WebDriver driver = Hooks.driver;
    SearchAddRemoveProduct searchAddRemoveProduct = new SearchAddRemoveProduct(driver);

    @And("Veify that product Red Tsirt and Onsie are displayed")
    public void veifyThatProductRedTsirtAndOnsieAreDisplayed() {
        searchAddRemoveProduct.verifyProductSauceLabsOneSie();
        searchAddRemoveProduct.verifyProductAllTheThingsTShirtRed();
    }
    @And("User navigate to filter button and short from Z to A")
    public void userNavigateToFilterButtonAndShortFromZToA() {
        searchAddRemoveProduct.selectSortDropdown("Name (Z to A)");
    }

    @And("Click add to chart product onsie")
    public void clickAddToChartProductOnsie() {
        searchAddRemoveProduct.clickAddToCartSauceLabsOnsie();
    }

    @And("Click add to chart product red tsirt")
    public void clickAddToChartProductRedTsirt() {
        searchAddRemoveProduct.clickAddToCartSauceLabsRedTsirt();
    }

    @And("User open cart menu")
    public void userOpenCartMenu() {
        searchAddRemoveProduct.clickCart();
    }

    @And("Remove the red tsirt")
    public void removeTheRedTsirt() {
        searchAddRemoveProduct.clickRemoveRedTShirt();
    }

    @Then("Click continue shopping")
    public void clickContinueShopping() {
        searchAddRemoveProduct.clickContinueShopping();
    }


}
