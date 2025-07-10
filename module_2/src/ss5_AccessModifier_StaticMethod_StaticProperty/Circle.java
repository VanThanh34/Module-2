package module_2.src.ss5_AccessModifier_StaticMethod_StaticProperty;

public class Circle {
    private double radius = 1.0;
    private String color = "red";

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public Circle() {

    }

    protected double getRadius() {
        return radius;
    }

    protected double getArea() {
        return radius * radius * Math.PI;
    }

    protected String getColor() {
        return color;
    }
}

class TestCircle {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        Circle circle2 = new Circle(1.5,"blue");
        System.out.println("Radius of Circle is: " + circle1.getRadius());
        System.out.println("Color of Circle is: " + circle1.getColor());
        System.out.println("Area of Circle is: " + circle1.getArea());
        System.out.println("Radius of Circle is: " + circle2.getRadius());
        System.out.println("Color of Circle is: " + circle2.getColor());
        System.out.println("Area of Circle is: " + circle2.getArea());
    }
}
