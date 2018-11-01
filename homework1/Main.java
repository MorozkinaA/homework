package homework1;

public class Main {
    public static void main(String[] args){
        Circle circ1 = new Circle();
        Circle circ2 = new Circle(4);
        Circle circ3 = new Circle(2, "green");
        System.out.println(circ1.toString());
        System.out.println(circ2.toString());
        System.out.println(circ3.toString());
        System.out.println(circ1.getArea());
        System.out.println(circ2.getArea());
        System.out.println(circ3.getArea());

        circ1.setColor("yellow");
        circ2.setColor("white");
        circ3.setColor("black");
        circ1.setRadius(3);
        circ2.setRadius(5);
        circ3.setRadius(6);
        System.out.println(circ1.toString());
        System.out.println(circ2.toString());
        System.out.println(circ3.toString());
        System.out.println(circ1.getArea());
        System.out.println(circ2.getArea());
        System.out.println(circ3.getArea());

        Rectangle rec1 = new Rectangle();
        Rectangle rec2 = new Rectangle(2, 3);
        System.out.println(rec1.toString());
        System.out.println(rec2.toString());
        System.out.println(rec1.getArea());
        System.out.println(rec2.getArea());
        System.out.println(rec1.getPerimeter());
        System.out.println(rec2.getPerimeter());

        MyTriangle tr1 = new MyTriangle(1,1, 10, 2, 2, 4);
        System.out.println(tr1.toString());
        System.out.println(tr1.getPerimeter());
        System.out.println(tr1.getType());

        MyPoint p1 = new MyPoint(1,1);
        MyPoint p2 = new MyPoint(1,3);
        System.out.println(p1.toString());
        System.out.println(p1.distance());
        System.out.println(p1.distance(4,1));
        System.out.println(p1.distance(p2));

    }
}
