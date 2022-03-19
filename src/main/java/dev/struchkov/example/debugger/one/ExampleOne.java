package dev.struchkov.example.debugger.one;

public class ExampleOne {

    private final PersonService personService = new PersonService();

    public static void main(String[] args) {
        final ExampleOne exampleOne = new ExampleOne();
        exampleOne.demo();
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
