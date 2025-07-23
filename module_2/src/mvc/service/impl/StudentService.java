package module_2.src.mvc.service.impl;


import module_2.src.mvc.entity.Student;
import module_2.src.mvc.repository.StudentRepository;
import module_2.src.mvc.service.IStudentService;

import java.util.List;

public class StudentService implements IStudentService {
    
    private static StudentRepository studentRepository = new StudentRepository();
    @Override
    public List<Student> getAll() {
        return studentRepository.getStudents();
    }

    @Override
    public void add(Student student) {
        studentRepository.add(student);
    }

    @Override
    public void update(Student student) {

    }

    @Override
    public void deleteById(int id) {
        studentRepository.deleteById(id);
    }

    @Override
    public Student findById(int id) {
        return studentRepository.findById(id);
    }
}
