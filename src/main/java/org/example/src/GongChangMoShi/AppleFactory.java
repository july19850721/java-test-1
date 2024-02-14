package org.example.src.GongChangMoShi;

//这里也可以是抽象类
public class AppleFactory implements FruitFactory{
    @Override
    public Apple produceFruit() {
        return new Apple();
    }
}
