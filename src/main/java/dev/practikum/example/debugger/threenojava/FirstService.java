package dev.practikum.example.debugger.threenojava;

import dev.practikum.example.debugger.box.SurpriseException;

public class FirstService {

    private final SecondService secondService;

    public FirstService(SecondService secondService) {
        this.secondService = secondService;
    }

    public void processing(Entity entity) {
        valid(entity.field);
        secondService.processing(entity);
        final String newField = entity.field;
        entity.field = "\033[31;1;4m" + newField + "!\033[0m";
    }

    private void valid(String field) {
        if (field.equals("Masha")) {
            throw new SurpriseException("Ошибочка вышла");
        }
    }

}
