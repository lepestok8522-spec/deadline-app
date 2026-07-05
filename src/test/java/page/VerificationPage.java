package page;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class VerificationPage {
    private final SelenideElement codeField = $("[data-test-id='code'] input");
    private final SelenideElement verifyButton = $("[data-test-id='action-verify']");

    public VerificationPage() {
        codeField.shouldBe(visible);
    }

    // Метод для ввода кода
    public void verify(String code) {
        codeField.setValue(code);
        verifyButton.click();
    }

    // Метод для успешной верификации
    public DashboardPage validVerify(String code) {
        verify(code);
        return new DashboardPage();
    }
}