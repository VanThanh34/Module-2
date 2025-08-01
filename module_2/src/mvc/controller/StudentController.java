package mvc.controller;

import mvc.entity.Student;
import mvc.service.IStudentService;
import mvc.service.impl.StudentService;

import java.util.List;


public class StudentController {
    private static final IStudentService studentService = new StudentService();
    public List<Student> getAll() {
        List<Student> students = studentService.getAll();
        return students;
    }

    public void add(Student student) {
        studentService.add(student);
    }

    public Student findById(int id) {
        return studentService.findById(id);
    }

    public void deleteById(int id) {
        studentService.deleteById(id);
    }
}
