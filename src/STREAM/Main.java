package STREAM;

public class Main {
    public static void main(String[] args) {
        // test
        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1,1);
        int c = calc.devide.apply(a, b); //а = 3, b = 0, возникает ошибка ArithmeticException: / by zero, делить на ноль нельзя

        calc.println.accept(c);

    }

}
