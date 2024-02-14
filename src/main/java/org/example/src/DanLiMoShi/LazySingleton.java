package org.example.src.DanLiMoShi;

//单例模式的一种，懒加载或者叫懒汉模式
//为了避免内存的浪费，我们可以采用懒加载，即用到该单例对象的时候再创建。
public class LazySingleton {
    /* 持有私有静态实例，防止被引用，此处赋值为null，目的是实现延迟加载 */
    private static LazySingleton instance = null;
    /* 私有构造方法，防止被实例化 */
    private LazySingleton() {
    }
    /* 1:懒汉式，静态工程方法，创建实例 */
    public static LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }

    public void print(){
        System.out.println("这个单例模式的懒汉模式");
    }
}
