package module_2.src.ss7_abstract_class_va_interface.Resizeable;

public class TestSquare {
    public static void main(String[] args) {
        Square s = new Square(5);
        System.out.println("Before resize: " + s);
        s.resize(30);
        System.out.println("After resize: " + s);
    }
}
