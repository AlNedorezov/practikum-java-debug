package dev.struchkov.example.debugger.four;

public class SecondService {

    private final ThirdService thirdService;

    public SecondService(ThirdService thirdService) {
        this.thirdService = thirdService;
    }

    public void processing(Entity entity) {
        thirdService.processing(entity);
        final String field = entity.getField();
        entity.setField("Nice to " + field);
    }

}
