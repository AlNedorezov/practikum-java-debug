package dev.practikum.example.debugger.one;

public class ExampleOne {

    private final PersonService personService = new PersonService();

    public static void main(String[] args) {
        final ExampleOne exampleOne = new ExampleOne();
        System.out.println("\n\nПрограмма запущена");
        exampleOne.demo();
        System.out.println("Программа выполнена");
    }

    private void demo() {
        demoOne();
//        demoTwo();
    }

    private void demoOne() {
        personService.showAllPerson();
        personService.deleteAllByLastName("Иванов");
        personService.showAllPerson();
    }

    private void demoTwo() {
        personService.showAllPerson();
        personService.correctDeleteAllByLastName("Скворцова");
        personService.showAllPerson();
    }

}
