package org.example.src.ChouXiangGongChangMoShi;

//抽象工厂模式拥有多个产品类（产品族）和一个抽象工厂类，每个抽象产品类可以派生出多个具体产品类；抽象工厂类也可以派生出多个具体工厂类，同时每个具体工厂类可以创建多个具体产品类的实例。
public interface AbstractFactory {
    //生产手机
    Phone producePhone();
    //生产平板
    Pad producePad();
}
