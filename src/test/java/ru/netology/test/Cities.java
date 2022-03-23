package ru.netology.test;

import java.util.Random;

public class Cities {

    public static String getRandomCity() {
        String[] arr = {"Майкоп", "Горно-Алтайск", "Уфа", "Улан-Удэ", "Махачкала", "Элиста", "Симферополь", "Ижевск", "Абакан", "Грозный", "Чебоксары", "Барнаул", "Чита", "Петропавловск-Камчатский", "Краснодар", "Красноярск", "Пермь", "Владивосток"};
        Random r = new Random();
        int randomNumber = r.nextInt(arr.length);

        return arr[randomNumber];
    }
}
