package module_2.src.mvc.service;


import module_2.src.mvc.entity.Student;

import java.util.List;

public interface IStudentService extends IService<Student> {


    List<Student> getAll();

    void add(Student student);

    void update(Student student);

    void deleteById(int id);

    Student findById(int id);
}
