package D_1005;

public class CalculatorMain {
    public static void main(String[] args) {
        Calculator calculator = new Calculator(new ByPassNumberCreator(), 20);
        calculator.plus(10);
    }
}
