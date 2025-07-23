package module_2.src.mvc.service;

import java.util.List;

public interface IService<T> {

    List<T> getAll();

    void add(T t);

    void update(T t);

    void deleteById(int id);

    T findById(int id);
}
