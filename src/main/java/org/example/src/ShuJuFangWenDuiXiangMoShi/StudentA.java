package org.example.src.ShuJuFangWenDuiXiangMoShi;

public class StudentA {
    private String name;
    private int rollNo;

    StudentA(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }
}
