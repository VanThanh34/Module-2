package mvc.service;


import mvc.entity.Employee;

import java.util.List;

public interface IEmployeeService extends IService<Employee> {
    List<Employee> getAll();

    void add(Employee e);

    void update(Employee employee);

    void deleteById(int id);

    Employee findById(int id);
}
