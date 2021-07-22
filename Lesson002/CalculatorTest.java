public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        do {
            int firstNumber = calculator.getFirstInt();
            char operation = calculator.getOperation();
            int secondNumber = calculator.getSecondInt();
            calculator.calc(firstNumber, operation, secondNumber);
        } while(calculator.getNextStep() == "yes");
    }
}