package module_2.src.ss7_abstract_class_va_interface.Resizeable;

public class Rectangle extends Shape implements Resizeable {
    private double width = 1.0;
    private double height = 1.0;

    public Rectangle() {
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(double width, double height, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return 2 * (width +height);
    }

    @Override
    public void resize(double percent) {
        width += percent/100 * width;
        height += percent/100 * height;
    }

    @Override
    public String toString() {
        return "A Rectangle with width= "
                + getWidth()
                + " and height= "
                + getHeight()
                + ", area = "
                + getArea()
                + ", perimeter = "
                + getPerimeter();
    }


}
