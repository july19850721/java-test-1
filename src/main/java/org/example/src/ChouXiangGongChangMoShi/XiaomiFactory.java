package org.example.src.ChouXiangGongChangMoShi;

public class XiaomiFactory implements AbstractFactory{
    @Override
    public XiaomiPhone producePhone() {
        return new XiaomiPhone();
    }

    @Override
    public XiaomiPad producePad() {
        return new XiaomiPad();
    }
}
