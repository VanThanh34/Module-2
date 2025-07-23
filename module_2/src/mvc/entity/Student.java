package module_2.src.mvc.entity;

public class Student extends Person implements Comparable<Student> {

    private double point;

    public Student() {
    }

    public Student(double point) {
        this.point = point;
    }

    public Student(int code, String name, int age, double point) {
        super(code, name, age);
        this.point = point;
    }

    @Override
    public int compareTo(Student o) {
        if(this.point > o.point) {
            return 1;
        } else if(this.point < o.point) {
            return -1;
        } else {
            return 0;
        }
    }
}
