package dev.practikum.example.debugger.two;

import dev.practikum.example.debugger.box.SurpriseBox;
import dev.practikum.example.debugger.box.SurpriseException;

public class FooService {

    public void example() {
        for (int i = 0; i < 1000; i++) {
            noSurpriseMethod(i);
            SurpriseBox.surpriseOne(i);
        }
    }

    private void noSurpriseMethod(int i) {
        if (i == 100) {
            try {
                throw new SurpriseException("Упс");
            } catch (SurpriseException e) {

            }
        }
    }

}
