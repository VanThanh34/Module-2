package module_2.src.ss6_ke_thua.HinhHoc;


class Circle {
    private double radius = 2.5;
    private String color = "White";

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
