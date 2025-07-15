package module_2.src.ss7_abstract_class_va_interface.HinhHoc;

class Cylinder extends Circle implements Carcu{
    private double height;
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }

    public String toString() {
        return super.toString() +" and "+ " Height: " + getHeight();
    }

    @Override
    public double getVolume() {
        return super.getArea() * height;
    }
}

  /* public double getVolume() {
        return super.getArea() * height;
    }*/