package module_2.src.ss7_Abstract_Class_Va_Interface.Colorable;

public class TestSquare {
    public static void main(String[] args) {
        Square square = new Square();
        square.setSide(4);
        System.out.println("Info: " + square);
        square.howToColor();
    }
}
