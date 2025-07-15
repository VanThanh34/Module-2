package module_2.src.ss5_access_modifier_static_method_static_property;

public class Student {
    private String name = "john";
    private String classname = "C02";

    public Student() {
    }
    public Student(String name, String classname) {
        this.name = name;
        this.classname = classname;
    }

    protected String setName(String name) {
        return this.name = name;
    }
    protected String setClasses(String classname) {
        return this.classname = classname;
    }

}

class Test{
    public static void main(String[] args) {
        Student s = new Student();
        System.out.println("Class of student: " + s.setClasses("C03"));
        System.out.println("Name of student: " + s.setName("Thanh"));

    }
}
