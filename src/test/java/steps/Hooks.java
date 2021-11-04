package steps;
import com.codeborne.selenide.Configuration;
import io.cucumber.java.Before;

import static com.codeborne.selenide.Selenide.*;

public class Hooks {
    @Before
    public void config() {
        Configuration.browser = "chrome";
        Configuration.browserSize = "1024x768";
        open("https://shop.acodemy.lv/");
    }
}
