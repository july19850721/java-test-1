package org.example.src.XiangYuanMoShi;

public class Flyweight implements IFlyweight {
    private final String id;

    public Flyweight(String id) {
        this.id = id;
    }

    @Override
    public void print() {
        System.out.println("Flyweight.id = " + getId() + " ...");
    }

    public String getId() {
        return id;
    }
}
