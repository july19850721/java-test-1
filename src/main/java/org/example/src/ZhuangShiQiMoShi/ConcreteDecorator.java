package org.example.src.ZhuangShiQiMoShi;

/**
 * 具体装饰器A继承抽象装饰器
 */
public class ConcreteDecorator extends Decorator {

    public ConcreteDecorator(Component component) {
        super(component);
    }

    /**
     * 具体组件动作执行前的装饰
     */
    public void before() {
        System.out.println("ConcreteDecorator前置操作....");
    }

    /**
     * 具体组件动作执行后的装饰
     */
    public void after() {
        System.out.println("ConcreteDecorator后置操作....");
    }

    /**
     * 组件本身执行的动作
     */
    public void execute() {
        before();
        component.execute();
        after();
    }
}
