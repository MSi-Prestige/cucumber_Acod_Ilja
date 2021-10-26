package steps;

import io.cucumber.java.en.Then;
import pages.ChaildPage;

public class ChaildPageDef {
    ChaildPage chaildPage = new ChaildPage();
    @Then("click Add to cart")
    public void clockAddToCart() {
           chaildPage.clickAddPurchase();
    }

    @Then("click shop basket")
    public void clickShopBasket() {
        chaildPage.clickBasket();
    }
}
