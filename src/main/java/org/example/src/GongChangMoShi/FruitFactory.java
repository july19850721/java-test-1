package org.example.src.GongChangMoShi;

//这里也可以是抽象类
//工厂模式
//工厂方法只有一个抽象产品类和一个抽象工厂类，但可以派生出多个具体产品类和具体工厂类，每个具体工厂类只能创建一个具体产品类的实例；
public interface FruitFactory {
    Fruit produceFruit();
}
