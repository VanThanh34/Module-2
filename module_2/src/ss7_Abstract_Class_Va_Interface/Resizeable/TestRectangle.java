package module_2.src.ss7_Abstract_Class_Va_Interface.Resizeable;

public class TestRectangle {
    public static void main(String[] args) {
        Rectangle rec1 = new Rectangle(12, 10);
        System.out.println("Before resize: " + rec1);

        rec1.resize(20);
        System.out.println("After resize: " + rec1);
    }
}
