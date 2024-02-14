package org.example.src.YuanXingMoShi;

public class Resume implements Cloneable {
    private String name;         //姓名
    private String sex;          //性别
    private String age;         //年龄
    private String timeArea;        //工作时间
    private String company;         //公司

    public Resume(String name)      //有参的构造方法
    {
        this.name = name;           //赋值
    }

    //设置个人信息
    public void SetPersonalInfo(String sex, String age) {
        this.sex = sex;   //赋值
        this.age = age;     //赋值
    }

    //设置工作经历
    public void SetWorkExperience(String timeArea, String company) {
        this.timeArea = timeArea;       //赋值
        this.company = company;         //赋值
    }

    //显示
    public void Display() {
        System.out.println(name + "_" + sex + " " + age);   //姓名，性别，年龄
        System.out.println("工作经历：" + timeArea + " " + company); //工作经历：工作时间，公司
    }


    @Override
    public Resume clone() {
        try {
            return (Resume) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
