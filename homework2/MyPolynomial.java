package homework2;

public class MyPolynomial {
    private double[] coeffs;

    public MyPolynomial(double... coeffs) {
        this.coeffs = coeffs;
    }

    public int getDegree(){
        return coeffs.length - 1;
    }

    @Override
    public String toString() {
        String result = "";
        if(coeffs.length >= 1) result+= coeffs[0]; //вводим
        if(coeffs.length > 1){
            for(int n = 1; n < coeffs.length; n++ ){
                result += "+" + coeffs[n] +"x^" + n;
            }
        }
        return result;
    }

    public double evaluate(double x) {
        double ev = 0;
        for(int n = 0; n < coeffs.length; n++){
            ev += coeffs[n] * Math.pow(x, n);
        }
        return ev;
    }

    public MyPolynomial add(MyPolynomial right) {
        double[] resCoeffs;
        if(this.coeffs.length > right.coeffs.length){  //length of resulting massive depends on which massive(this or right) is bigger
            resCoeffs = new double[this.coeffs.length];
            for(int i = 0; i < right.coeffs.length; i++) {
                resCoeffs[i] = right.coeffs[i] + this.coeffs[i];
            }
            for(int j = right.coeffs.length; j < this.coeffs.length; j++){
                resCoeffs[j] = this.coeffs[j];
            }
        }
        else {
            resCoeffs = new double[right.coeffs.length];
            for(int i = 0; i < this.coeffs.length; i++) {
                resCoeffs[i] = right.coeffs[i] + this.coeffs[i];
            }
            for(int j = this.coeffs.length; j < right.coeffs.length; j++){
                resCoeffs[j] = right.coeffs[j];
            }
        }
        MyPolynomial res = new MyPolynomial(resCoeffs);
        return res;
    }

    public MyPolynomial multiply(MyPolynomial right) {
        double[] resCoeffs = new double[this.coeffs.length + right.coeffs.length - 1]; //massive of resulting coeffs
        for(int i = 0; i < this.coeffs.length; i ++) {
            for(int j = right.coeffs.length - 1; j >= 0; j -- ){
                resCoeffs[i + j] += this.coeffs[i] * right.coeffs[j];
            }
        }
        MyPolynomial res = new MyPolynomial(resCoeffs);
        return res;
    }

    @Override
    public boolean equals(Object o) {
        if(o == this) {
            return true;
        }
        if(!(o instanceof MyPolynomial)){
            return true;
        }
        MyPolynomial pol = (MyPolynomial) o;
        return pol.coeffs.equals(coeffs);
    }

    @Override
    public int hashCode() {
        int result = 17;
        for(int i = 0; i < coeffs.length; i++ ){
            result = 31*result + (int)(Double.doubleToLongBits(coeffs[i])^(Double.doubleToLongBits(coeffs[i]) >>> 32));
        }
        return result;
    }
}
