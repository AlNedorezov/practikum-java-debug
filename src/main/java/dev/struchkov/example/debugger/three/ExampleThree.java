package dev.struchkov.example.debugger.three;

public class ExampleThree {

    public static void main(String[] args) {
        final ThirdService thirdService = new ThirdService();
        final SecondService secondService = new SecondService(thirdService);
        final FirstService firstService = new FirstService(secondService);

        final Entity entity = new Entity("Dasha");
        firstService.processing(entity);

        System.out.println();
        System.out.println(entity);
        System.out.println();
    }

}
