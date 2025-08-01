package mvc.service.impl;


import module_2.src.mvc.entity.Employee;
import mvc.service.IEmployeeService;


import java.util.List;

public class EmployeeService implements IEmployeeService {


    @Override
    public List<Employee> getAll() {
        return List.of();
    }

    @Override
    public void add(Employee e) {

    }

    @Override
    public void update(Employee employee) {

    }

    @Override
    public void deleteById(int id) {

    }

    @Override
    public Employee findById(int id) {
        return null;
    }
}
