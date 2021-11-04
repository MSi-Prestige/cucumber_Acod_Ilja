package pages;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$;

public class MainPage {
    public void clickPurchase() {
        $(By.xpath("//h2[contains(@class, 'woocommerce-loop-product__title') and text() = 'Belt']")).click();

    }
    public void clickPurchaseBeanie(){
        $(By.xpath("//h2[contains(@class, 'woocommerce-loop-product__title') and text() = 'Beanie']")).click();
    }
}
