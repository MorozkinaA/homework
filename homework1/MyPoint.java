package homework1;

public class MyPoint {
    private double x = 0;
    private double y = 0;

    public MyPoint() {
    }

    public MyPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double[] getXY() {
        double[] res = {x, y};
        return res;
    }

    public void setXY(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString(){
        return "(" + x + ", " + y + ")";
    }

    public double distance( double x, double y) {
        return Math.sqrt((this.x - x) * (this.x - x) + (this.y - y) * (this.y - y));
    }

    public double distance(MyPoint another) {
        return Math.sqrt((x - another.getX()) * (x - another.getX()) + (y - another.getY()) * (y - another.getY()));
    }

    public double distance(){
        return Math.sqrt(x * x + y * y);
    }

    @Override
    public boolean equals(Object o) {
        if(o == this) {
            return true;
        }
        if(!(o instanceof MyPoint)){
            return true;
        }
        MyPoint p = (MyPoint)o;
        return p.x == x && p.y == y;
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31*result + (int)(Double.doubleToLongBits(x)^(Double.doubleToLongBits(x) >>> 32));
        result = 31*result + (int)(Double.doubleToLongBits(y)^(Double.doubleToLongBits(y) >>> 32));
        return result;
    }
}
