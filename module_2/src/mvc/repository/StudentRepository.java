package mvc.repository;

import mvc.entity.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentRepository {

    private static List<Student> students = new ArrayList<>();

    public List<Student> getStudents() {
        return students;
    }

    public void add(Student student) {
        students.add(student);
    }

    public Student findById(int id) {
        for (Student student : students) {
            if (student.getCode() == id) {
                return student;
            }
        }
        return null;
    }

    public void deleteById(int id) {
        for (Student student : students) {
            if (student.getCode() == id) {
                students.remove(student);
                break;
            }
        }
    }
}
