package module_2.src.ss7_Abstract_Class_Va_Interface.Resizeable;

public class TestSquare {
    public static void main(String[] args) {
        Square s = new Square(5);
        System.out.println("Before resize: " + s);
        s.resize(30);
        System.out.println("After resize: " + s);
    }
}
