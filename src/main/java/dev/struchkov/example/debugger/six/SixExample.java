package dev.struchkov.example.debugger.six;

public class SixExample {

    public static void main(String[] args) {
        final AbstractService firstChild = new FirstChild();
        final AbstractService secondChild = new SecondChild();

        demoOne(secondChild);
        demoTwo(firstChild);
    }

    private static int demoTwo(AbstractService firstChild) {
        return firstChild.processing(5);
    }

    private static int demoOne(AbstractService secondChild) {
        return secondChild.processing(10);
    }

}
