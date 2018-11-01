package homework2;

public class Main {
    public static void main (String[] args){
        //testing homework2.Ball and homework2.Container Class
        Ball b1 = new Ball(3, 3, 2, 3, 90);
        System.out.println(b1.toString());
        b1.reflectHorizontal();
        System.out.println(b1.toString());
        b1.reflectVertical();
        System.out.println(b1.toString());

        System.out.println();
        Ball b2 = new Ball(3, 3, 2, 3, 90);
        System.out.println(b2.toString());
        Container c1 = new Container(1,1, 5,4);
        System.out.println(c1.toString());
        System.out.println(c1.collides(b2)); //must be true
        b2.move();
        System.out.println(c1.collides(b2)); //must be false after moving



        System.out.println();

        //testing homework2.MyPolynomial Class
        MyPolynomial p1 = new MyPolynomial(1, 2, 3, 4);
        System.out.println(p1.toString());
        System.out.println("Value of polynomial if x = 2: " + p1.evaluate(2)); //must be 49
        System.out.println("Max degree = " + p1.getDegree());

        System.out.println();
        MyPolynomial p2 = new MyPolynomial(1, 2, 3); //testing add and multiply with a polynomal with 3 coeffs
        System.out.println(p1.add(p2).toString());  //must be 2 + 4*x + 6*x^2 + 4*x^3
        System.out.println(p1.multiply(p2).toString()); //must be 1 + 4*x + 10*x^2 + 16*x^3 + 17*x^4 + 12*x^5

        System.out.println();
        MyPolynomial p3 = new MyPolynomial(3); //testing add and multiply with a polynomial with only one coeff c0
        System.out.println(p1.add(p3).toString()); //must be 4 + 2*x + 3*x^2 + 4*x^3
        System.out.println(p1.multiply(p3).toString()); //must be 3 + 6*x + 9*x^2 + 12*x^3
    }
}
