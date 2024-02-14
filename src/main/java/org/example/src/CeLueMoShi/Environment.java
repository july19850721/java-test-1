package org.example.src.CeLueMoShi;

public class Environment {
    private final Strategy strategy;

    public Environment(Strategy strategy) {
        this.strategy = strategy;
    }

    public int calculate(int a, int b) {
        return strategy.calc(a, b);
    }
}
