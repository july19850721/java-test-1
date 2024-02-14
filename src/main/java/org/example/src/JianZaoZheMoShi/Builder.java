package org.example.src.JianZaoZheMoShi;

public abstract class Builder {
    //抽象的构建者
    //声明Bike类型的变量,并进行赋值
    protected Bike bike = new Bike();

    //构建车架
    public abstract void buildFrame();

    //构建车座
    public abstract void buildSeat();

    //构建自行车的方法
    public abstract Bike createBike();
}
