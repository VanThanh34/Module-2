package module_2.src.mvc.controller;


import module_2.src.mvc.entity.Student;
import module_2.src.mvc.service.IStudentService;
import module_2.src.mvc.service.impl.StudentService;


import java.util.List;

public class StudentController {
    private static IStudentService studentService = (IStudentService) new StudentService();
    public List<Student> getAll() {
        List<Student> students = studentService.getAll();
        return students;
    }
}
