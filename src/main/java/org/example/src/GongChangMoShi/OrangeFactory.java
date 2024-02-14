package org.example.src.GongChangMoShi;

public class OrangeFactory implements FruitFactory{
    @Override
    public Orange produceFruit() {
        return new Orange();
    }
}
