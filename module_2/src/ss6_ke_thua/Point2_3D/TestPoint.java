package ss6_ke_thua.Point2_3D;

import java.util.Arrays;

class TestPoint {
    public static void main(String[] args) {
        Point2D point1 = new Point2D();
        point1.setX(3.1f);
        point1.setY(4.1f);
        point1.setXY(3.5f, 4.5f);
        System.out.println(point1.getX());
        System.out.println(point1.getY());
        System.out.println(Arrays.toString(point1.getXY()));
        System.out.println("Info: " + point1);
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
        System.out.println("Info: " + point3);
    }
}
