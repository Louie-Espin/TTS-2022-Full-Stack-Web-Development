package asu.lfespino;

public class Calculator {

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        int num1 = 3;
        int num2 = 3;

        System.out.printf("Add: %d + %d = %d\n", num1, num2, calc.add(num1,num2));
        System.out.printf("Subtract: %d - %d = %d\n", num1, num2, calc.subtract(num1,num2));
        System.out.printf("Multiply: %d * %d = %d\n", num1, num2, calc.multiply(num1,num2));
        System.out.printf("Divide: %d / %d = %d\n", num1, num2, calc.divide(num1,num2));
        System.out.printf("Square: %d^2 = %d\n", num1, calc.square(num1));

    }

    public int add(int num1, int num2) {
        return num1 + num2;
    }

    public int subtract(int num1, int num2) {
        return num1 - num2;
    }

    public int multiply(int num1, int num2) {
        return num1 * num2;
    }

    public int divide(int num1, int num2) {
        return num1 / num2;
    }

    public int square(int num1) {
        return num1 * num1;
    }
}
