package qa.tests.utils;

import com.github.javafaker.Faker;

public class FakerPage {

    static Faker faker = new Faker();

    // public String
    //       state = getRandomFakerUserState(),
    //     city = getRandomFakerUserCity(state);

    public static String fakeGender() {
        String[] genders = {"Male", "Female", "Other"};
        return faker.options().option(genders);
    }

    public static String fakeSubjects() {
        String[] subjects = {"English", "Computer Science", "Chemistry"};
        return faker.options().option(subjects);
    }

    public static String fakeHobbies() {
        String[] hobbies = {"Sports", "Music", "Reading"};
        return faker.options().option(hobbies);
    }

    public static String fakeMonth() {
        String[] month = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        return faker.options().option(month);
    }

    public static String fakeYear() {
        String[] year = {"2022", "2023", "2024", "1990"};
        return faker.options().option(year);
    }

    public static String getRandomFakerUserState() {
        String[] state = {"NCR", "Uttar Pradesh", "Haryana", "Rajasthan"};
        return new Faker().options().option(state);
    }

    public static String getRandomFakerUserCity(String state) {
        switch (state) {
            case "NCR":
                String[] city = {"Delhi", "Gurgaon", "Noida"};
                return faker.options().option(city);
            case "Uttar Pradesh":
                String[] city1 = {"Agra", "Lucknow", "Merrut"};
                return faker.options().option(city1);
            case "Haryana":
                String[] city2 = {"Karnal", "Panipat"};
                return faker.options().option(city2);
            case "Rajasthan":
                String[] city3 = {"Jaipur", "Jaiselmer"};
                return faker.options().option(city3);
            default:
                return null;
        }
    }
}
