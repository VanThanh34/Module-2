package module_2.src.mvc.repository;


import module_2.src.mvc.entity.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentRepository {

    private static List<Student> students = new ArrayList<>();

    public List<Student> getStudents() {
        return students;
    }
}
