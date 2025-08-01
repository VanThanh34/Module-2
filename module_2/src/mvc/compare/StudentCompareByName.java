package mvc.compare;


import mvc.entity.Student;

import java.util.Comparator;

public class StudentCompareByName implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return 0;
    }
}
