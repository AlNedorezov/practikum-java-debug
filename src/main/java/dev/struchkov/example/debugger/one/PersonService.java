package dev.struchkov.example.debugger.one;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class PersonService {

    private final Map<Long, Person> names = new HashMap<>();

    public PersonService() {
        init();
    }

    public void deleteAllByLastName(String lastName) {
        for (Person person : names.values()) {
            if (lastName.equals(person.getLastName())) {
                names.remove(person.getId());
            }
        }
    }

    public void showAllPerson() {
        System.out.println("\nПользователи системы:");
        for (Person person : names.values()) {
            System.out.println(person);
        }
        System.out.println();
    }

    public void init() {
        names.putAll(
                Map.of(
                        1L, new Person(1L, "Алексей", "Кашемиров"),
                        2L, new Person(2L, "Никита", "Иванов"),
                        3L, new Person(3L, "Иван", "Сизов"),
                        4L, new Person(4L, "Михаил", "Иванов"),
                        5L, new Person(5L, "Ксения", "Скворцова")
                )
        );
    }

    public void correctDeleteAllByLastName(String lastName) {
        final Iterator<Person> iterator = names.values().iterator();
        while (iterator.hasNext()) {
            final Person person = iterator.next();
            if (lastName.equals(person.getLastName())) {
                iterator.remove();
            }
        }
    }

}
