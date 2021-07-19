public class Calculator {
    public static void main(String[] args) {
        char operation = '^';
        int firstNumber = 5;
        int secondNumber = 5;
        int result = 1;

        if (operation == '+') {
            result = firstNumber + secondNumber;
        } else if (operation == '-') {
            result = firstNumber - secondNumber;
        } else if (operation == '*') {
            result = firstNumber * secondNumber;
        } else if (operation == '/') {
            result = firstNumber / secondNumber;
        } else if (operation == '^') {
            for (int i = 1; i <= secondNumber; i++) {
                result *= firstNumber;
            }
        } else if (operation == '%') {
            result = firstNumber % secondNumber;
        }
        System.out.println(firstNumber + " " + operation + " " + secondNumber + " = " + result);
    }
}