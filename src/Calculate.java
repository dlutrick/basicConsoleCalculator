public class Calculate {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.registerOperation("+", Integer::sum);
        calculator.registerOperation("-", (a, b) -> a - b);
        calculator.registerOperation("*", (a, b) -> a * b);
        calculator.registerOperation("/", (a, b) -> a / b);

        int answer = calculator.calculate(360, "/", 9);
        System.out.println(answer);
    }
}
