package org.example.src.CeLueMoShi;

public class AddStrategy implements Strategy {
    @Override
    public int calc(int num1, int num2) {
        return num1 + num2;
    }
}
