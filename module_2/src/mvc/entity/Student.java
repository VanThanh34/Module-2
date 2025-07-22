package module_2.src.mvc.entity;

public class Student extends Person {

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
}
