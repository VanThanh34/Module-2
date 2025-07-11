package module_2.src.ss6_Ke_Thua;

import java.util.Arrays;

public class Point2D {
    public float x = 0.0f;
    public float y = 0.0f;
    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }
    public Point2D() {}

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }
    public float[] getXY(){
        return new float[] {x,y};
    }
    public String toString(){
        return String.format("(%.1f, %.1f)", x, y);
    }
}
class Point3D extends Point2D {
    public float z = 0.0f;
    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }
    public Point3D(){}

    public float getZ() {
        return z;
    }
    public void setZ(float z) {
        this.z = z;
    }
    public void setXYZ(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public float[] getXYZ() {
        return new float[] {x,y,z};
    }
    public String toString(){
        return String.format("(%.1f, %.1f, %.1f)", x, y,z);
    }
}
class TestPoint {
    public static void main(String[] args) {
        Point2D point1 = new Point2D();
        point1.setX(3.1f);
        point1.setY(4.1f);
        point1.setXY(3.5f, 4.5f);
        System.out.println(point1.getX());
        System.out.println(point1.getY());
        System.out.println(Arrays.toString(point1.getXY()));
        System.out.println("Info: " + point1.toString());
        System.out.println();
        Point3D point2 = new Point3D();
        point2.setX(3.1f);
        point2.setY(4.1f);
        point2.setZ(5.1f);
        point2.setXYZ(3.5f, 4.5f, 5.5f);
        Point3D point3 = new Point3D(6.5f, 7.5f, 8.5f);
        System.out.println(point2.getX());
        System.out.println(point2.getY());
        System.out.println(point2.getZ());
        System.out.println(Arrays.toString(point2.getXYZ()));
        System.out.println("Info: " + point3.toString());
    }
}
