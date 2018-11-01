package homework1;
public class Circle {
    private double radius = 1.0;
    private String color = "red";

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Circle[radius = " + radius + ", color = " + color + "]";
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public boolean equals(Object o) {
        if(o == this) {
            return true;
        }
        if(!(o instanceof Circle)){
            return true;
        }
        Circle circle = (Circle)o;
        return circle.radius == radius && circle.color.equals(color);
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31*result + color.hashCode();
        result = 31*result + (int)(Double.doubleToLongBits(radius)^(Double.doubleToLongBits(radius) >>> 32));
        return result;
    }
}
