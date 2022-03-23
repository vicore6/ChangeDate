package ru.netology.data;

import com.github.javafaker.Faker;
import ru.netology.test.Cities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DataGenerator {

    private DataGenerator() {
    }

    public static String generateDate(int days) {
        String date = LocalDate.now().plusDays(days).format(DateTimeFormatter.ofPattern("dd.MM.yyyy"));
        return date;
    }

    public static String generateCity() {

        String city = Cities.getRandomCity();
        return city;
    }

    public static String generateName() {
        Faker faker = new Faker(new Locale("RU"));
        String name = faker.name().fullName();
        return name;
    }

    public static String generatePhone() {
        Faker faker = new Faker(new Locale("RU"));
        String phone = faker.phoneNumber().phoneNumber();
        return phone;
    }
}