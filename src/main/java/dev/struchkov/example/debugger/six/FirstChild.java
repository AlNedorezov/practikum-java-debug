package dev.struchkov.example.debugger.six;

public class FirstChild extends AbstractService {

    @Override
    int processing(int arg) {
        final int result = arg + 1;
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        return result;
    }

}
