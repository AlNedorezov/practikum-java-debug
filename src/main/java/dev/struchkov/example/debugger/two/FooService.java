package dev.struchkov.example.debugger.two;

import dev.struchkov.example.debugger.box.SurpriseBox;

public class FooService {

    public void example() {
        for (int i = 0; i < 1000; i++) {
            SurpriseBox.surpriseOne(i);
        }
    }

}
