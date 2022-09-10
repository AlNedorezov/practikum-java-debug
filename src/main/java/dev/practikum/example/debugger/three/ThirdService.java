package dev.practikum.example.debugger.three;

public class ThirdService {

    public void processing(Entity entity) {
        entity.setField("meet you " + entity.getField());
    }

}
