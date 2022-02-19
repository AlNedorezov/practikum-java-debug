package dev.struchkov.example.debugger.one;

public class ExampleOne {

    public static void main(String[] args) {
        final PersonService personService = new PersonService();

        demoOne(personService);
//        demoTwo(personService);
    }

    private static void demoOne(PersonService personService) {
        personService.showAllPerson();
        personService.deleteAllByLastName("Иванов");
        personService.showAllPerson();
    }

    private static String getIvanovName() {
        return "Иванов";
    }

    private static void demoTwo(PersonService personService) {
        personService.showAllPerson();
        personService.correctDeleteAllByLastName("Скворцова");
        personService.showAllPerson();
    }

}
