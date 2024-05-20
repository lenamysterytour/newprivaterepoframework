package qa.tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class RegistrationTests {

    @BeforeAll
    static void beforeAll() {
        Configuration.browser = "chrome";
        Configuration.browserSize = "1920x1080";
        Configuration.baseUrl = "https://demoqa.com";
    }

    @Test
    void successTest() {
        open("/automation-practice-form");
        executeJavaScript("$('#fixedban').remove()");
        executeJavaScript("$('footer').remove()");
        $("#firstName").setValue("Vasya");
        $("#lastName").setValue("Pupkin");
        $("#userEmail").setValue("vasya@pupkin.com");
        $("#genterWrapper").$(byText("Male")).click();
        $("#userNumber").setValue("2741001274");
        $("#dateOfBirthInput").pressEnter();
        $("#subjectsInput").setValue("E");
        $(byText("English")).click();
        $("#hobbiesWrapper").$(byText("Reading")).click();
        $("#currentAddress").setValue("Kazansky vokzal");
        $("#uploadPicture").uploadFromClasspath("Java.png");
        $("#stateCity-wrapper").$("#state").click();
        $("#state").$(byText("NCR")).click();
        $("#stateCity-wrapper").$("#city").click();
        $("#city").$(byText("Gurgaon")).click();
        $("#submit").click();


        $(".table-responsive").shouldHave(text("Vasya Pupkin"));
        $(".table-responsive").shouldHave(text("vasya@pupkin.com"));
        $(".table-responsive").shouldHave(text("Male"));
        $(".table-responsive").shouldHave(text("2741001274"));
        $(".table-responsive").shouldHave(text("1 June,2023"));
        $(".table-responsive").shouldHave(text("English"));
        $(".table-responsive").shouldHave(text("Kazansky vokzal"));
        $(".table-responsive").shouldHave(text("NCR"));
        $(".table-responsive").shouldHave(text("Gurgaon"));


    }
}