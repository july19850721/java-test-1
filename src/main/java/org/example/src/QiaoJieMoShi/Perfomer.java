package org.example.src.QiaoJieMoShi;

public abstract class Perfomer {
    //桥接属性
    protected IPlayType playType;

    //构造表演方法
    public Perfomer(IPlayType playType) {
        this.playType = playType;
    }

    //表演
    abstract protected void perform();
}
