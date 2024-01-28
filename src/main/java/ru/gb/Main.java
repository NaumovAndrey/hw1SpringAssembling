package ru.gb;

import com.google.gson.Gson;
import ru.gb.model.Person;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Andrey", "Naumov", 41);
        System.out.println(person);

        Gson gson = new Gson();
        String textGson = gson.toJson(person);
        System.out.println(textGson);

        Person deserializedPerson = gson.fromJson(String.valueOf(textGson), Person.class);
        System.out.printf("first name: %s; last name: %s; age: %d"
                , deserializedPerson.getFirstName()
                , deserializedPerson.getLastName()
                , deserializedPerson.getAge());
    }
}