package org.example.src.ChouXiangGongChangMoShi;

public class HuaweiFactory implements AbstractFactory{
    @Override
    public HuaweiPhone producePhone() {
        return new HuaweiPhone();
    }

    @Override
    public HuaweiPad producePad() {
        return new HuaweiPad();
    }
}