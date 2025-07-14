package module_2.src.ss6_Ke_Thua.HinhHoc;

class Cylinder extends Circle {
    private double height;
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public double getVolume() {
        return super.getArea() * height;
    }
    public String toString() {
        return super.toString() +" and "+ " Height: " + getHeight();
    }
}

