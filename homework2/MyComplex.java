package homework2;

import homework1.MyPoint;

public class MyComplex {
    private double real = 0.0;
    private double imag = 0.0;

    public MyComplex() {
    }

    public MyComplex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImag() {
        return imag;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }

    public void setValue(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    @Override
    public String toString() {
        return "(" + real + "+" + imag + "i)";
    }

    public boolean isReal() {
        if(real != 0 && imag == 0) return true;
        return false;
    }

    public boolean isImeginary() {
        if(imag != 0 && real == 0) return true;
        return false;
    }

    public boolean equals(double real, double imag) {
        if(this.real == real && this.imag == imag) return true;
        return false;
    }

    public boolean equals(MyComplex another) {
        if(this.real == another.real && this.imag == another.imag) return true;
        return false;
    }

    public double magnitude() {
        return Math.sqrt(real * real + imag * imag);
    }

    public double argument() {
        return Math.atan(imag / real);
    }

    public MyComplex add(MyComplex right) {
        this.real += right.real;
        this.imag += right.imag;
        return this;
    }

    public MyComplex addNew(MyComplex right) {
        MyComplex comp = new MyComplex(this.real + right.real, this.imag + right.imag);
        return comp;
    }

    public MyComplex substract(MyComplex right) {
        this.real -= right.real;
        this.imag -= right.imag;
        return this;
    }

    public MyComplex substractNew(MyComplex right) {
        MyComplex comp = new MyComplex(this.real - right.real, this.imag - right.imag);
        return comp;
    }

    public MyComplex multiply(MyComplex right) {
        double real1 = this.real;
        double imag1 = this.imag;
        this.real = real1 * right.real - imag1 * right.imag;
        this.imag = real1 * right.imag + right.real * imag1;
        return this;
    }

    public MyComplex divide(MyComplex right) {
        double real1 = this.real;
        double imag1 = this.imag;
        this.real = (real1 * right.real + imag1 * right.imag) / (right.real * right.real + right.imag * right.imag);
        this.imag = (right.real * imag1 - real1 * right.imag) / (right.real * right.real + right.imag * right.imag);
        return this;
    }

    public MyComplex conjugate() {
        MyComplex comp = new MyComplex(this.real, -this.imag);
        return comp;
    }

    @Override
    public boolean equals(Object o) {
        if(o == this) {
            return true;
        }
        if(!(o instanceof MyComplex)){
            return true;
        }
        MyComplex comp = (MyComplex)o;
        return comp.real == real && comp.imag == imag;
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31*result + (int)(Double.doubleToLongBits(real)^(Double.doubleToLongBits(real) >>> 32));
        result = 31*result + (int)(Double.doubleToLongBits(imag)^(Double.doubleToLongBits(imag) >>> 32));
        return result;
    }




}
