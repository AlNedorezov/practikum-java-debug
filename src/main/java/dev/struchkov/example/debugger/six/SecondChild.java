package dev.struchkov.example.debugger.six;

public class SecondChild extends AbstractService {

    @Override
    int processing(int arg) {
        final int result = arg + 2;
        return result;
    }

}
