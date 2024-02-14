package org.example.src.XiangYuanMoShi;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {
    private final Map<String, IFlyweight> flyweightMap = new HashMap<>();

    public IFlyweight getFlyweight(String str) {
        return flyweightMap.computeIfAbsent(str, Flyweight::new);
    }

    public int getFlyweightMapSize() {
        return flyweightMap.size();
    }
}
