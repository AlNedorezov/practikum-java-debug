package dev.struchkov.example.debugger.three;

public class TreadMain {

    public static void main(String[] args) {
        final ThreadExample one = new ThreadExample("Первый");
        final ThreadExample two = new ThreadExample("Второй");

        new Thread(one).start();
        new Thread(two).start();
    }

}
