package ru.netology.page;

import org.junit.jupiter.api.Test;
import ru.netology.data.DataHelper;

import static com.codeborne.selenide.Selenide.open;

public class MainPage {
    @Test
    void cardNumberEmpty() {
        var mainPage = open("http://localhost:8080", MainPage.class);
        var buyPage = mainPage.simpleBuy();
        var cardInfo = DataHelper.getApprovedCardAllForm();
        buyPage.formCardArbitraryNumber(cardInfo, "");
        buyPage.findMessageError("number", "Поле обязательно для заполнения");
        buyPage.formCardArbitraryNumber(cardInfo, DataHelper.generateInvalidNumericData(1));
        buyPage.findMessageError("number", "Неверный формат");
    }
}
