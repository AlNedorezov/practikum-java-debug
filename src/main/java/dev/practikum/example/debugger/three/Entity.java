package dev.practikum.example.debugger.three;

public class Entity {

    private String field;

    public Entity(String field) {
        this.field = field;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    @Override
    public String toString() {
        return field;
    }

}
