package module_2.src.ss5_AccessModifier_StaticMethod_StaticProperty;

class MyClass {
    void method(int x, int y) {
        x = 5;
        y = 5;
    }

    public static void main(String[] args) {
        MyClass o = new MyClass();
        int x = 1, y = 1;
        o.method(x, y);
        System.out.printf("x=%d, y=%d", x, y);
    }
}