package org.example.src.DanLiMoShi;

//单例模式的一种，预加载或者叫饿汉模式
//很明显，没有使用该单例对象，该对象就被加载到了内存，会造成内存的浪费。
public class PreloadSingleton {
    public static PreloadSingleton instance = new PreloadSingleton();

    //其他的类无法实例化单例类的对象
    private PreloadSingleton() {
    };

    public static PreloadSingleton getInstance() {
        return instance;
    }

    public void print(){
        System.out.println("这个单例模式的饿汉模式");
    }
}
