package module_2.src.mvc.entity;

public abstract class Person {
    private int code;
    private String name;
    private int age;

    public Person() {
    }

    public Person(int code, String name, int age) {
        this.code = code;
        this.name = name;
        this.age = age;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
