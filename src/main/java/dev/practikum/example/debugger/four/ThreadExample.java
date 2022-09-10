package dev.practikum.example.debugger.four;

public class ThreadExample implements Runnable {

    private final String name;

    public ThreadExample(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(name + ": " + i);
        }
    }

}
