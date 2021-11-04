package steps;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import io.cucumber.java.After;
import io.cucumber.java.Before;

import static com.codeborne.selenide.Selenide.*;




public class Hooks {
    @Before
    public void config() {
        Configuration.browser = "chrome";
        Configuration.browserSize = "1024x768";
        open("https://shop.acodemy.lv/");
    }
    @After
    public void after(){
        Selenide.closeWebDriver();
    }
}

