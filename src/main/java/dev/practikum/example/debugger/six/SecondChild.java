package dev.practikum.example.debugger.six;

public class SecondChild extends AbstractService {

    @Override
    int processing(int arg) {
        final int result = arg + 2;
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        return result;
    }

}
