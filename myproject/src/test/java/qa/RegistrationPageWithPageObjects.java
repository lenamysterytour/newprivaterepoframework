package qa;


import qa.pages.RegistrationPage;
import qa.pages.components.ConfirmationPage;
import org.junit.jupiter.api.Test;

public class RegistrationPageWithPageObjects extends TestBase {

    RegistrationPage registrationPage = new RegistrationPage();
    ConfirmationPage confirmationPage = new ConfirmationPage();

    @Test
    void successTest() {
        registrationPage.openPage().removeAds()
                .setFirstName("Vasya")
                .setLastName("Pupkin")
                .setEmail("vasya@pupkin.ru")
                .setGender("Male")
                .setNumber("2741001274")
                .setBirthday("July", "2008", "1")
                .setSubjectInput("English")
                .setHobbies("Reading")
                //.uploadPicture("Java.png")
                .setCurrentAddress("Kazansky Vokzal")
                .setState("NCR")
                .setCity("Gurgaon")
                .pushSubmit();
        confirmationPage
                .nameConfirmation("Vasya Pupkin")
                .emailConfirmation("vasya@pupkin.ru")
                .genderConfirmation("Male")
                .numberConfirmation("2741001274")
                .birthdayConfirmation("1 July,2008")
                .subjectConfirmation("English")
                .hobbiesConfirmation("Reading")
                //   .pictureConfirmation("Java.png")
                .addressConfirmation("Kazansky vokzal")
                .stateConfirmation("NCR")
                .cityConfirmation("Gurgaon");
    }
}
