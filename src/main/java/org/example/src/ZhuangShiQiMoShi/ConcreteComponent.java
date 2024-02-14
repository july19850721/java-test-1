package org.example.src.ZhuangShiQiMoShi;

/**
 * 具体组件（需要被装饰的组件）
 */
public class ConcreteComponent extends Component {
    @Override
    public void execute() {
        System.out.println("具体组件处理业务逻辑");
    }
}
