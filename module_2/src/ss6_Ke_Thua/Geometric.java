/*
package module_2.src.ss6_Ke_Thua;

public class Geometric {
    private String color = "White";
    private String filled = null;
    public Geometric(){
    }
    public Geometric(String color, String filled){
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getFilled() {
        return filled;
    }

    public void setFilled(String filled) {
        this.filled = filled;
    }
    public String toString() {
        return "created with \"" + color + "\" color and " +
                (filled == null ? "no fill" : "filled with \"" + filled + "\" color");
    }
}

     public void printCircle(){
         System.out.println("The " + getColor() + " circle with radius with the radius is " + getRadius());
     }
 }
 class Rectangle extends Geometric{
    private double width;
    private double height;

    public Rectangle(){
    }
    public Rectangle(double width, double height){
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
     public double getArea(){
        return width * height;
     }
     public double getPerimeter(){
        return 2 * (width + height);
     }
 }
class TestCircleRectangle{
    public static void main(String[] args) {
        Geometric circle = new Geometric("brown", "green");
        Circle circle1 = new Circle();
        circle.setFilled("black");
        circle1.setRadius(1.8);
        Circle circle2 = new Circle(1.5);
        System.out.println();
        circle1.printCircle();
        System.out.println("A circle main " + circle.toString());
        System.out.println("The radius is " + circle1.getRadius());
        System.out.println("The area is " + circle1.getArea());
        System.out.println("The diameter is " + circle1.getDiameter());
        System.out.println("The perimeter is " + circle2.getPerimeter());
        System.out.println();
        Rectangle rectangle1 = new Rectangle(2, 4);
        Rectangle rectangle2 = new Rectangle();
        rectangle1.setFilled("red");
        rectangle1.setColor("blue");
        rectangle2.setWidth(3);
        rectangle2.setHeight(5);
        System.out.println("A rectangle " + rectangle1.toString());
        System.out.println("Width is " + rectangle2.getWidth());
        System.out.println("Height is " + rectangle2.getHeight());
        System.out.println("The area is " + rectangle1.getArea());
        System.out.println("The perimeter is " + rectangle1.getPerimeter());
        System.out.println();

    }
}*/
