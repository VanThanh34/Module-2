package module_2.src.ss6_ke_thua.Point2_3D;

class Point3D extends Point2D {
    private float z = 0.0f;
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
        setX(x);
        setY(y);
        this.z = z;
    }
    public float[] getXYZ() {
        return new float[] {getX(),getY(),z};
    }
    public String toString(){
        return String.format("(%.1f, %.1f, %.1f)", getX(), getY(),z);
    }
}
