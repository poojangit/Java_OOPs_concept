package compiletime;

public class Calculator {
    int a, b;

    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    double add(double b, int a) {
        return b + a;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.add(10.7, 20));
        System.out.println(calc.add(10, 20));
        System.out.println(calc.add(30.6, 60.78));
    }
}
