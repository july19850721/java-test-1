package org.example.src.ShiPeiQiMoShi;

public class Adapter extends Adaptee implements Target {
    @Override
    public int output5V() {
        // 获取到220V的电压
        int a = output220V();
        // 处理电压，转成5V
        return a / 44;
    }
}
