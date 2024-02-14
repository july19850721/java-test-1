package org.example.src.ZhuangShiQiMoShi;

/**
 * 抽象装饰器（继承、实现抽象组件，并持有抽象组件）
 */
public abstract class Decorator extends Component {

    /**
     * 抽象组件
     */
    public Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    /**
     * 将执行动作转发给组件本身执行，可以在转发前后做装饰
     */
    public void execute() {
        component.execute();
    }
}
