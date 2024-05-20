package qa.pages.components;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class ConfirmationPage {

    SelenideElement nameConfirmationInput = $(".table-responsive");

    public ConfirmationPage nameConfirmation(String value) {
        nameConfirmationInput.shouldHave(text(value));
        return this;
    }

    public ConfirmationPage genderConfirmation(String value) {
        nameConfirmationInput.shouldHave(text(value));
        return this;
    }

    public ConfirmationPage emailConfirmation(String value) {
        nameConfirmationInput.shouldHave(text(value));
        return this;
    }

    public ConfirmationPage numberConfirmation(String value) {
        nameConfirmationInput.shouldHave(text(value));
        return this;
    }

    public ConfirmationPage birthdayConfirmation(String value) {
        nameConfirmationInput.shouldHave(text(value));
        return this;
    }

    public ConfirmationPage subjectConfirmation(String value) {
        nameConfirmationInput.shouldHave(text(value));
        return this;
    }

    public ConfirmationPage hobbiesConfirmation(String value) {
        nameConfirmationInput.shouldHave(text(value));
        return this;
    }

    public ConfirmationPage pictureConfirmation(String value) {
        nameConfirmationInput.shouldHave(text(value));
        return this;
    }

    public ConfirmationPage addressConfirmation(String value) {
        nameConfirmationInput.shouldHave(text(value));
        return this;
    }

    public ConfirmationPage stateConfirmation(String value) {
        nameConfirmationInput.shouldHave(text(value));
        return this;
    }

    public ConfirmationPage cityConfirmation(String value) {
        nameConfirmationInput.shouldHave(text(value));
        return this;
    }


}
