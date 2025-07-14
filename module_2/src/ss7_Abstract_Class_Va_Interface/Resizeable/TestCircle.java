package module_2.src.ss7_Abstract_Class_Va_Interface.Resizeable;

public class TestCircle {
    public static void main(String[] args) {
        Circle c = new Circle(10);
        System.out.println("Before resize: " + c);

        c.resize(20);
        System.out.println("After resize: " + c);
    }
}
