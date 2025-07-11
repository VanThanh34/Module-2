package module_2.src.ss6_Ke_Thua;

class Circle {
    public double radius = 2.5;
    public String color = "White";

    public Circle() {
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public double getDiameter() {
        return 2 * radius;
    }
    public String toString(){
         return "The " + getColor() + " cylinder with radius with the radius is " + getRadius();
    }
}
class Cylinder extends Circle {
    private double height;
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
         this.height = height;
    }
    public double getVolume() {
        return Math.PI * height * height;
    }
    public String toString() {
        return super.toString() +" and "+ " Height: " + getHeight();
    }
}
class TestCylinder{
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        cylinder.setHeight(1.5);
        System.out.println("Info " + cylinder);
        System.out.println("The radius is " + cylinder.getRadius());
        System.out.println("The area is " + cylinder.getArea());
        System.out.println("The diameter is " + cylinder.getDiameter());
        System.out.println("The perimeter is " + cylinder.getPerimeter());
        System.out.println("The volume is " + cylinder.getVolume());
        System.out.println();
        System.out.println();
        Circle circle = new Circle();
        circle.setRadius(3.5);
        circle.setColor("Black");
        Circle circle2 = new Circle(4.5, "blue");
        System.out.println("Info " + circle);
        System.out.println("The radius is " + cylinder.getRadius());
        System.out.println("Color of circle is: " + circle2.getColor());
        System.out.println("The area is " + cylinder.getArea());
        System.out.println("The diameter is " + cylinder.getDiameter());
        System.out.println("The perimeter is " + cylinder.getPerimeter());
    }
}