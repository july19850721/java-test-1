package org.example.src.QiaoJieMoShi;

public class Guitar implements IPlayType {
    @Override
    public void play(String name) {
        System.out.println(name + "用吉他唱歌了");
    }
}
