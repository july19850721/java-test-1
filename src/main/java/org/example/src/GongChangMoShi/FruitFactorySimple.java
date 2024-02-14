package org.example.src.GongChangMoShi;

//简单工厂模式
public class FruitFactorySimple {
    //违反了开闭原则，不太容易扩展新产品类，如果产品改变，需要改变工厂的具体方法。
    //对扩展开放，对修改关闭。
    public Fruit produce(String type){
        if(type.equals("apple")){
            return new Apple();
        }else if(type.equals("orange")){
            return new Orange();
        }else{
            System.out.println("请输入正确的类型!");
            return null;
        }
    }
}
