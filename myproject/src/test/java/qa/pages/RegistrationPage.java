package qa.pages;

import com.codeborne.selenide.SelenideElement;
import qa.pages.components.CalendarComponent;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.executeJavaScript;

public class RegistrationPage {

    CalendarComponent calendarComponent = new CalendarComponent();

    SelenideElement firstNameInput = $("#firstName"),
            secondNameInput = $("#lastName"),
            userEmail = $("#userEmail"),
            genderWrapper = $("#genterWrapper"),
            setNumber = $("#userNumber"),
            birthDayInput = $("#dateOfBirthInput"),
            subjectChooseInput = $("#subjectsWrapper").$("#subjectsInput"),
            setHobbiesInput = $("#hobbiesWrapper"),
            uploadPictureInput = $("#uploadPicture"),
            currentAddressInput = $("#currentAddress"),
            stateInput = $("#stateCity-wrapper").$("#state"),
            cityInput = $("#stateCity-wrapper").$("#city"),
    submitPushInput = $("#submit");

    public RegistrationPage openPage() {
        open("/automation-practice-form");
        return this;
    }

    public RegistrationPage removeAds() {
        executeJavaScript("$('#fixedban').remove()");
        executeJavaScript("$('footer').remove()");
        return this;
    }


    public RegistrationPage setFirstName(String value) {
        firstNameInput.setValue(value);
        return this;
    }

    public RegistrationPage setLastName(String value) {
        secondNameInput.setValue(value);
        return this;
    }

    public RegistrationPage setEmail(String value) {
        userEmail.setValue(value);
        return this;
    }

    public RegistrationPage setGender(String value) {
        genderWrapper.$(byText(value)).click();
        return this;
    }

    public RegistrationPage setNumber(String value) {
        setNumber.setValue(value);
        return this;
    }

    public RegistrationPage setBirthday(String month, String year, String day) {
        birthDayInput.click();
        calendarComponent.setDate(month, year, day);
        return this;
    }


    public RegistrationPage setSubjectInput(String value) {
        subjectChooseInput.setValue(value).pressEnter();
        return this;
    }

    public RegistrationPage setHobbies(String value) {
        setHobbiesInput.$(byText(value)).click();
        return this;
    }

    public RegistrationPage uploadPicture(String value) {
        uploadPictureInput.uploadFromClasspath(value);
        return this;
    }

    public RegistrationPage setCurrentAddress(String value) {
        currentAddressInput.setValue(value);
        return this;
    }
    public RegistrationPage setState(String value) {
        stateInput.click();
        stateInput.$(byText(value)).click();
        return this;
    }

    public RegistrationPage setCity(String value) {
        cityInput.click();
        cityInput.$(byText(value)).click();
        return this;}

    public RegistrationPage pushSubmit (){
        submitPushInput.click();
    return this;}

}
