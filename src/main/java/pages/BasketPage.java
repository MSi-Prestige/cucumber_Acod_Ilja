package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class BasketPage {


    private SelenideElement fieldInput = $(By.xpath("//input[@id='coupon_code']"));
    public void fieldInput(String discount) {
        this.fieldInput.val(discount);
    }

    public void aplyCoupon(){
        $(By.xpath("//button[@name='apply_coupon']")).click();
    }

}
