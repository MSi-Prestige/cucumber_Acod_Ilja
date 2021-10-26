package steps;

import io.cucumber.java.en.Given;
import pages.MainPage;

public class MainPageDef {
    MainPage mainPage = new MainPage();
    @Given("click on purchase")
    public void clickOnPurchase() {
        mainPage.clickPurchase();
    }
}
