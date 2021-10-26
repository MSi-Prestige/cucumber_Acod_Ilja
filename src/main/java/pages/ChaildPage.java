package pages;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$;

public class ChaildPage {
    public void clickAddPurchase() {
          $(By.xpath("//button[contains(@class, 'single_add_to_cart_button button alt') and text() = 'Add to cart']")).click();
    }
    public void clickBasket(){
        $(By.xpath("//ul[@id='site-header-cart']/li[1]/a")).click();
    }
}
