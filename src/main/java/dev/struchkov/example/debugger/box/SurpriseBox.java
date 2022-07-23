package dev.struchkov.example.debugger.box;

public final class SurpriseBox {

    public static void surpriseOne(int i) {
        if (i == 896) {
            throw new SurpriseException("Сюрприииииииз");
        }
    }

}
