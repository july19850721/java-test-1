package org.example.src.ShuJuFangWenDuiXiangMoShi;

import java.util.ArrayList;
import java.util.List;

public class StudentDaoImpl implements StudentDao {

    //列表是当作一个数据库
    List<StudentA> students;

    public StudentDaoImpl() {
        students = new ArrayList<StudentA>();
        StudentA student1 = new StudentA("Robert", 0);
        StudentA student2 = new StudentA("John", 1);
        students.add(student1);
        students.add(student2);
    }

    @Override
    public void deleteStudent(StudentA student) {
        students.remove(student.getRollNo());
        System.out.println("Student: Roll No " + student.getRollNo()
                + ", deleted from database");
    }

    //从数据库中检索学生名单
    @Override
    public List<StudentA> getAllStudents() {
        return students;
    }

    @Override
    public StudentA getStudent(int rollNo) {
        return students.get(rollNo);
    }

    @Override
    public void updateStudent(StudentA student) {
        students.get(student.getRollNo()).setName(student.getName());
        System.out.println("Student: Roll No " + student.getRollNo()
                + ", updated in the database");
    }
}
