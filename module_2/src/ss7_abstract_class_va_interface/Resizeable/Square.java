package module_2.src.ss7_abstract_class_va_interface.Resizeable;

public class Square extends Shape implements Resizeable {
    private double side = 1.0;

    public Square() {
    }

    public Square(double side) {
        this.side = side;
    }

    public Square(String color, boolean filled, double side) {
        super(color, filled);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getArea() {
        return side * side;
    }

    public double getPerimeter() {
        return side * 4;
    }

    @Override
    public void resize(double percent) {
        side += percent/100 * side;
    }
    @Override
    public String toString() {
        return "A Square with radius= "
                + getSide()
                + ", area = "
                + getArea()
                + ", perimeter = "
                + getPerimeter();
    }
}
