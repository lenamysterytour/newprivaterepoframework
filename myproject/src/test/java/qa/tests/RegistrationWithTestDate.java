package qa.tests;

import com.codeborne.selenide.Configuration;
import com.github.javafaker.Faker;
import qa.TestBase;
import qa.tests.utils.FakerPage;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class RegistrationWithTestDate extends TestBase {

    @BeforeAll
    static void beforeAll() {
        Configuration.browser = "chrome";
        Configuration.browserSize = "1920x1080";
        Configuration.baseUrl = "https://demoqa.com";
    }

    @Test
    void successTest() {

        Faker faker = new Faker();
        FakerPage fakerPage = new FakerPage();

        String fakeFirstName = faker.name().firstName(),
                fakeLastName = faker.name().lastName(),
                fakeEmail = faker.internet().emailAddress(),
                fakeNumber = faker.numerify("##########"),
                fakeCurrentAddress = faker.address().fullAddress();

        String
                fakeState = FakerPage.getRandomFakerUserState(),
                fakeCity = FakerPage.getRandomFakerUserCity(fakeState),
                fakeGender = FakerPage.fakeGender(),
                fakeSubject = FakerPage.fakeSubjects(),
                fakeHobbie = FakerPage.fakeHobbies(),
                fakePicture = "Java.png",
                fakeYear = FakerPage.fakeYear(),
                fakeMonth = FakerPage.fakeMonth();


        open("/automation-practice-form");
        executeJavaScript("$('#fixedban').remove()");
        executeJavaScript("$('footer').remove()");
        $("#firstName").setValue(fakeFirstName);
        $("#lastName").setValue(fakeLastName);
        $("#userEmail").setValue(fakeEmail);
        $("#genterWrapper").$(byText(fakeGender)).click();
        $("#userNumber").setValue(fakeNumber);
        $("#dateOfBirthInput").click();
        $(".react-datepicker__month-select").selectOption(fakeMonth);
        $(".react-datepicker__year-select").selectOption(fakeYear);
        $("div.react-datepicker__day--001:not(.react-datepicker__day--outside-month").click();
        $("#subjectsInput").setValue("E");
        $(byText(fakeSubject)).click();
        $("#hobbiesWrapper").$(byText(fakeHobbie)).click();
        $("#uploadPicture").uploadFromClasspath(fakePicture);
        $("#currentAddress").setValue(fakeCurrentAddress);
        $("#stateCity-wrapper").$("#state").click();
        $("#state").$(byText(fakeState)).click();
        $("#stateCity-wrapper").$("#city").click();
        $("#city").$(byText(fakeCity)).click();
        $("#submit").click();


        $(".table-responsive").shouldHave(text(fakeFirstName));
        $(".table-responsive").shouldHave(text(fakeLastName));
        $(".table-responsive").shouldHave(text(fakeEmail));
        $(".table-responsive").shouldHave(text(fakeGender));
        $(".table-responsive").shouldHave(text(fakeNumber));
        $(".table-responsive").shouldHave(text(fakeMonth));
        $(".table-responsive").shouldHave(text(fakeYear));
        $(".table-responsive").shouldHave(text(fakeSubject));
        $(".table-responsive").shouldHave(text(fakeHobbie));
        $(".table-responsive").shouldHave(text(fakePicture));
        $(".table-responsive").shouldHave(text(fakeCurrentAddress));
        $(".table-responsive").shouldHave(text(fakeState));
        $(".table-responsive").shouldHave(text(fakeCity));


    }
}