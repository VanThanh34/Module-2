package mvc.service;


import module_2.src.mvc.entity.Employee;

import java.util.List;

public interface IEmployeeService extends module_2.src.mvc.service.IService<Employee> {
    List<Employee> getAll();

    void add(Employee e);

    void update(Employee employee);

    void deleteById(int id);

    Employee findById(int id);
}
