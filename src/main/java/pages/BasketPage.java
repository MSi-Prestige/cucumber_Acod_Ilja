package pages;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class BasketPage {
    private SelenideElement sumWithOutDiscount = $(By.xpath("//div[@class='cart_totals']//td//bdi"));

    private SelenideElement fieldInput = $(By.xpath("//input[@id='coupon_code']"));
    public void fieldInput(String discount) {
        this.fieldInput.val(discount);
    }

    public void aplyCoupon(){
        $(By.xpath("//button[@name='apply_coupon']")).click();
    }

    public void compareSum(){
            sumWithOutDiscount.getText();
        System.out.println(sumWithOutDiscount.getText());
    }
    public void clickProceedToCheckout() {
        $(By.xpath("//*[@id='post-7']/div/div/div[2]/div/div/a")).click();
    }
    public void placeOrder(){
        $(By.xpath("//*[@id='place_order']")).click();
    }
}

