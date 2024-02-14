package org.example.src.GuanChaZheMoShi;

//定义一个抽象被观察者接口
public interface Subject {
    public void registerObserver(Observer o);

    public void removeObserver(Observer o);

    public void notifyObserver();
}
