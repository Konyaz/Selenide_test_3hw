import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;


import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class GitSelenideTest {
    @Test
    void successfulFillTest() {
        open("https://github.com");


    }
}
