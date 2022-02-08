package dev.struchkov.example.debugger.four;

public class ThirdService {

    public void processing(Entity entity) {
        entity.setField("meet you " + entity.getField());
    }

}
