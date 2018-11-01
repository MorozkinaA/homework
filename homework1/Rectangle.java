package homework1;
public class Rectangle {
    private float length = 1.0f;
    private float width = 1.0f;

    public Rectangle() {
    }

    public Rectangle(float length, float width) {
        this.length = length;
        this.width = width;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public double getArea () {
        return length * width;
    }

    public double getPerimeter() {
        return 2 * (length + width);
    }

    @Override
    public String toString() {
        return "Rectangle[length = " + length + ", width = " + width + "]";
    }

    @Override
    public boolean equals(Object o) {
        if(o == this) {
            return true;
        }
        if(!(o instanceof Rectangle)){
            return true;
        }
        Rectangle rec = (Rectangle)o;
        return rec.length == length && rec.width == width;
    }

    @Override
    public int hashCode() {
        int result = 21;
        result = 31*result + Float.floatToIntBits(length);
        result = 31*result + Float.floatToIntBits(width);
        return result;
    }


}
