package module_2.src.ss5_AccessModifier_StaticMethod_StaticProperty;

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
    protected String setClassname(String classname) {
        return this.classname = classname;
    }

    public String getName() {
        return name;
    }

    public String getClassname() {
        return classname;
    }
}

class Test{
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("Thanh");
        s.setClassname("C03");
        Student z = new Student();
        Student x = new Student("Chris", "C04");
        System.out.println("Class of student: " + s.getClassname());
        System.out.println("Name of student: " + s.getName());
        System.out.println("Info of student: "+z.getClassname()+" "+z.getName());
        System.out.println("Info of student: "+x.getClassname()+" "+x.getName());
    }
}
