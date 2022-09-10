package dev.practikum.example.debugger.threenojava;

public class SecondService {

    private final ThirdService thirdService;

    public SecondService(ThirdService thirdService) {
        this.thirdService = thirdService;
    }

    public void processing(Entity entity) {
        thirdService.processing(entity);
        final String field = entity.field;
        entity.field = "Nice to " + field;
    }

}
