package org.example.src.JianZaoZheMoShi;

public class MobileBuilder extends Builder {
    //具体的构建者
    @Override
    public void buildFrame() {
        bike.setFrame("Mobile->碳纤维车架");
    }

    @Override
    public void buildSeat() {
        bike.setSeat("Mobile->真皮车座");
    }

    @Override
    public Bike createBike() {
        return bike;
    }
}