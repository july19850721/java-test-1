package org.example.src.ShuJuFangWenDuiXiangMoShi;

import java.util.List;

public interface StudentDao {
    List<StudentA> getAllStudents();

    StudentA getStudent(int rollNo);

    void updateStudent(StudentA student);

    void deleteStudent(StudentA student);
}
