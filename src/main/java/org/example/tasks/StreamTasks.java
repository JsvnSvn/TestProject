package org.example.tasks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StreamTasks {

    //Вывести в консоль телефоны, у которых количество символов <10
    //Вывести в консоль количество элементов
    //Вывести в консоль первый элемент
    //Вывести в консоль случайный элемент
    //Пропустить первый элемент и вывести в консоль 2 следующих элемента

    public List<String> createPhoneList() {
        List<String> phones = new ArrayList<>();
        Collections.addAll(phones, "iPhone 8", "HTC U12", "Huawei Nexus 6P",
                "Samsung Galaxy S9", "LG G6", "Xiaomi MI6", "ASUS Zenfone 2",
                "Sony Xperia Z5", "Meizu Pro 6", "Lenovo S850");

        return phones;
    }

    public static void sortPhones() {

    }

}
