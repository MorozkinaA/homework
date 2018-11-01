package homework2;

public class Container {
    private int x1;
    private int y1;
    private int x2;
    private int y2;

    public Container(int x, int y, int width, int height) {
        this.x1 = x;
        this.y1 = y;
        this.x2 = x + width;
        this.y2 = y + height;
    }

    public int getX() {
        return x1;
    }

    public int getY() {
        return y1;
    }

    public int getWidth() {
        return x2 - x1;
    }

    public int getHeight() {
        return y2 - y1;
    }

    public boolean collides(Ball ball) {
        if((ball.getX() - ball.getRadius()) >= this.x1 && (ball.getX() + ball.getRadius()) <= this.x2 &&
                (ball.getY() - ball.getRadius()) >= this.y1 && (ball.getY() + ball.getRadius()) <= this.y2){
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Container[(" + x1 + "," + y1 + "), (" + x2 + "," + y2 + ")]";
    }

    @Override
    public boolean equals(Object o) {
        if(o == this) {
            return true;
        }
        if(!(o instanceof Container)){
            return true;
        }
        Container cont = (Container)o;
        return cont.x1 == x1 && cont.y1 == y1 && cont.x2 == x2 && cont.y2 == y2;
    }

    @Override
    public int hashCode() {
        int result = 31;
        result = 31*result + x1;
        result = 31*result + y1;
        result = 31*result + x2;
        result = 31*result + y2;
        return result;
    }
}
