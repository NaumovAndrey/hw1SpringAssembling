package ru.gb;

import com.google.gson.Gson;
import ru.gb.model.Person;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Andrey", "Naumov", 41);
        System.out.println(person);
    }
}