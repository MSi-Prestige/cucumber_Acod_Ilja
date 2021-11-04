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
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Then("get subtotal and compare with Total")
    public void getSubtotalAndCompareWithTotal() {
basketPage.compareSum();
    }

    @And("click place order")
    public void clickPlaceOrder() {
        basketPage.placeOrder();
    }

    @Then("click proceed to checkout")
    public void clickProceedToCheckout() {
        basketPage.clickProceedToCheckout();
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
