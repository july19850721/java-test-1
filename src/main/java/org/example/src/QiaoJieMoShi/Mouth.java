package org.example.src.QiaoJieMoShi;

public class Mouth implements IPlayType {
    @Override
    public void play(String name) {
        System.out.println(name + "用嘴唱歌了");
    }
}