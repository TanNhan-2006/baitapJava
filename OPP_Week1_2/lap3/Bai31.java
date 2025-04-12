public class Bai31 {
    public static class MyComplex {
        private double real;
        private double imag;

        public MyComplex() {
            this.real = 0.0;
            this.imag = 0.0;
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

        @Override
        public String toString() {
            return "(" + real + (imag >= 0 ? "+" : "") + imag + "i)";
        }

        public boolean isReal() {
            return imag == 0;
        }

        public boolean isImaginary() {
            return real == 0;
        }

        public boolean equals(double real, double imag) {
            return this.real == real && this.imag == imag;
        }

        public boolean equals(MyComplex another) {
            return this.real == another.real && this.imag == another.imag;
        }

        public double magnitude() {
            return Math.sqrt(real * real + imag * imag);
        }

        public double argument() {
            return Math.atan2(imag, real);
        }

        public MyComplex addInto(MyComplex right) {
            this.real += right.real;
            this.imag += right.imag;
            return this;
        }

        public MyComplex add(MyComplex right) {
            return new MyComplex(this.real + right.real, this.imag + right.imag);
        }

        public MyComplex subtract(MyComplex right) {
            return new MyComplex(this.real - right.real, this.imag - right.imag);
        }

        public MyComplex multiply(MyComplex right) {
            double realPart = this.real * right.real - this.imag * right.imag;
            double imagPart = this.real * right.imag + this.imag * right.real;
            return new MyComplex(realPart, imagPart);
        }

        public MyComplex divide(MyComplex right) {
            double denominator = right.real * right.real + right.imag * right.imag;
            double realPart = (this.real * right.real + this.imag * right.imag) / denominator;
            double imagPart = (this.imag * right.real - this.real * right.imag) / denominator;
            return new MyComplex(realPart, imagPart);
        }

        public MyComplex conjugate() {
            return new MyComplex(this.real, -this.imag);
        }
    }

    public static void main(String[] args) {
        MyComplex complex1 = new MyComplex(3, 4);
        MyComplex complex2 = new MyComplex(1, -1);

        System.out.println("Complex1: " + complex1);
        System.out.println("Complex2: " + complex2);

        MyComplex sum = complex1.add(complex2);
        System.out.println("Sum: " + sum);

        MyComplex difference = complex1.subtract(complex2);
        System.out.println("Difference: " + difference);

        MyComplex product = complex1.multiply(complex2);
        System.out.println("Product: " + product);

        MyComplex quotient = complex1.divide(complex2);
        System.out.println("Quotient: " + quotient);

        System.out.println("Magnitude of complex1: " + complex1.magnitude());
        System.out.println("Argument of complex1: " + complex1.argument());
    }
}
