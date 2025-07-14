package module_2.src.ss6_Ke_Thua.HinhHoc;

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
