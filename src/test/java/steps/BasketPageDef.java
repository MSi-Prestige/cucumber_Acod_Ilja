package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.BasketPage;


public class BasketPageDef {
    BasketPage basketPage = new BasketPage();
    @Then("add coupon {string} discount")
    public void addCouponDiscount(String arg0) {
            basketPage.fieldInput(arg0);
    }

    @And("click Apply coupon")
    public void clickApplyCoupon() {
        basketPage.aplyCoupon();
    }
}
