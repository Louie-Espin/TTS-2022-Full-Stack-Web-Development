package asu.lfespino;

public class MagicCalculator extends Calculator{

    public static void main(String[] args) {
        MagicCalculator calc = new MagicCalculator();
        int num1 = 4;
        int num2 = 4;

        double numDouble = 4.0;

        System.out.printf("Add: %d + %d = %d\n", num1, num2, calc.add(num1,num2));
        System.out.printf("Subtract: %d - %d = %d\n", num1, num2, calc.subtract(num1,num2));
        System.out.printf("Multiply: %d * %d = %d\n", num1, num2, calc.multiply(num1,num2));
        System.out.printf("Divide: %d / %d = %d\n", num1, num2, calc.divide(num1,num2));
        System.out.printf("Square: %d^2 = %d\n", num1, calc.square(num1));

        System.out.printf("Square Root: %,.4f^(1/2) = %,.4f\n", numDouble, calc.squareRoot(numDouble));
        System.out.printf("Sine: sin(%,.4f) = %,.4f\n", numDouble, calc.sine(numDouble));
        System.out.printf("Cosine: cos(%,.4f) = %,.4f\n", numDouble, calc.cosine(numDouble));
        System.out.printf("Tangent: tan(%,.4f) = %,.4f\n", numDouble, calc.tangent(numDouble));
        System.out.printf("Factorial: %d! = %d\n", num1, calc.factorial(num1));
    }

    public MagicCalculator() {
        super();
    }

    public double squareRoot(double num) {
        return Math.sqrt(num);
    }

    public double sine(double num) {
        return Math.cos(num);
    }

    public double cosine(double num) {
        return Math.cos(num);
    }

    public double tangent(double num) {
        return Math.tan(num);
    }

    // Recursive implementation
    public int factorial(int num) {
        if (num == 0) return 1;

        return (num * factorial(num - 1));
    }

}
