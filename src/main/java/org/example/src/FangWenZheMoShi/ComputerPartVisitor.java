package org.example.src.FangWenZheMoShi;

public interface ComputerPartVisitor {
    void visit(Computer1 computer);

    void visit(Mouse mouse);

    void visit(Keyboard keyboard);

    void visit(Monitor monitor);
}
