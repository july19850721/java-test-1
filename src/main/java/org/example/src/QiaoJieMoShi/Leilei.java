package org.example.src.QiaoJieMoShi;

public class Leilei extends Perfomer {
    //构造方法传递需要的乐器表演方式
    public Leilei(IPlayType playType) {
        super(playType);
    }

    @Override
    public void perform() {
        playType.play("磊磊");
    }
}
