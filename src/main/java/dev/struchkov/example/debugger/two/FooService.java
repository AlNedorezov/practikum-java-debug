package dev.struchkov.example.debugger.two;

import dev.struchkov.example.debugger.box.SurpriseBox;
import dev.struchkov.example.debugger.box.SurpriseException;

public class FooService {

    public void example() {
        for (int i = 0; i < 1000; i++) {
            testMethod(i);
            SurpriseBox.surpriseOne(i);
        }
    }

    private void testMethod(int i) {
        if (i == 100) {
            try {
                throw new SurpriseException("Упс");
            } catch (SurpriseException e) {

            }
        }
    }

}
