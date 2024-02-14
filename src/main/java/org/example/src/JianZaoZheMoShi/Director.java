package org.example.src.JianZaoZheMoShi;

public class Director {
    //指挥者
    //声明builder类型的变量
    private final Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    //组装自行车的功能
    public Bike construct() {
        builder.buildFrame();
        builder.buildSeat();
        return builder.createBike();
    }
}
