package dev.struchkov.example.debugger.four;

public class ExampleFour {

    public static void main(String[] args) {
        final ThreadExample one = new ThreadExample("Первый");
        final ThreadExample two = new ThreadExample("Второй");

        new Thread(one).start();
        new Thread(two).start();
    }

}
