package org.example.src.JianZaoZheMoShi;

public class OfoBuilder extends Builder {
    @Override
    public void buildFrame() {
        bike.setFrame("Ofo->铝合金车架");
    }

    @Override
    public void buildSeat() {
        bike.setSeat("Ofo->橡胶车座");
    }

    @Override
    public Bike createBike() {
        return bike;
    }
    //单车构建者
}
