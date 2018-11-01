package homework1;


public class MyTriangle {
    MyPoint v1 = new MyPoint();
    MyPoint v2 = new MyPoint();
    MyPoint v3 = new MyPoint();

    public MyTriangle(double x1, double y1, double x2, double y2, double x3, double y3) {
        v1.setXY(x1, y1);
        v2.setXY(x2, y2);
        v3.setXY(x3, y3);
    }

    public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }

    @Override
    public String toString() {
        String toStringResult = "MyTriangle[v1 = (" + v1.getX() + "," + v1.getY() +
                "), v2 = ("+ v2.getX() + "," + v2.getY() +
                "), v3= ("+ v3.getX() + "," + v3.getY() + ")]";
        return toStringResult;
    }

    public double getPerimeter() {
        return v1.distance(v2) + v2.distance(v3) + v3.distance(v1);
    }

    public String getType(){
        double side1 = v1.distance(v2);
        double side2 = v2.distance(v3);
        double side3 = v1.distance(v3);
        String type ="";
        if(side1 == side2) {  //if two sides are equal, triangle can be Equilaterial or Isoscales
            if (side2 == side3) {
                type = "Equilaterial";
            }
            else type = "Isosceles";
        }
        else if(side1 == side3) {
            if (side3 == side2) {
                type = "Equilaterial";
            }
            else type = "Isosceles";
        }
        else if(side2 == side3) {
            if (side1 == side2) {
                type = "Equilaterial";
            }
            else type = "Isosceles";
        }
        else if(side1 != side2 && side2 != side3 && side1 != side3){  //checking if all sides are not equal
            type = "Scalene";
        }
        return type;
    }

    @Override
    public boolean equals(Object o) {
        if(o == this) {
            return true;
        }
        if(!(o instanceof MyTriangle)){
            return true;
        }
        MyTriangle tr = (MyTriangle)o;
        return tr.v1.equals(v1) && tr.v2.equals(v2) && tr.v3.equals(v3);
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31*result + v1.hashCode();
        result = 31*result + v2.hashCode();
        result = 31*result + v3.hashCode();
        return result;
    }
}
