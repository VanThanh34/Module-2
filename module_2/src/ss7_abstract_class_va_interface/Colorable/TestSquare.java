package module_2.src.ss7_abstract_class_va_interface.Colorable;

public class TestSquare {
    public static void main(String[] args) {
        Square square = new Square();
        square.setSide(4);
        System.out.println("Info: " + square);
        square.howToColor();
    }
}
