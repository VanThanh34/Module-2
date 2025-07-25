package module_2.src.ss6_ke_thua.Point2_3D;

 public class Point2D {
    private float x = 0.0f;
    private float y = 0.0f;
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


