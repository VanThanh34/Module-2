package module_2.src.ss7_abstract_class_va_interface.Resizeable;

public class TestCircle {
    public static void main(String[] args) {
        Circle c = new Circle(10);
        System.out.println("Before resize: " + c);

        c.resize(20);
        System.out.println("After resize: " + c);
    }
}
