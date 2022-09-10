package dev.practikum.example.debugger.threenojava;

public class Entity {

    public String field;

    public Entity(String field) {
        this.field = field;
    }

    @Override
    public String toString() {
        return field;
    }

}
