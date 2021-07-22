import java.util.Scanner;

public class Calculator {
    Scanner scanner = new Scanner(System.in);

    public int getFirstInt() {
        System.out.print("Введите первое число: ");
        int firstNumber = scanner.nextInt();
        return firstNumber;
    }

    public int getSecondInt() {
        System.out.print("Введите второе число: ");
        int secondNumber = scanner.nextInt();
        return secondNumber;
    }

    public char getOperation() {
        System.out.print("Введите знак математической операции: ");
        char operation = scanner.next().charAt(0);
        return operation;
    }

    public String getNextStep() {
        System.out.print("Хотите продолжить вычисления? [yes/no]: ");
        String nextStep = scanner.next();
        if (nextStep.equals("yes")) {
            return "yes";
        } else if (nextStep.equals("no")) {
            return "no";
        } else {
            nextStep = getNextStep();
        }
        return nextStep;
    }

    public void calc(int firstNumber, char operation, int secondNumber) {
        int result;
        switch(operation) {
            case '+' :
                result = firstNumber + secondNumber;
                System.out.println("Сумма равна: " + result);
                break;
            case '-' :
                result = firstNumber - secondNumber;
                System.out.println("Разность равна: " + result);
                break;
            case '*' :
                result = firstNumber * secondNumber;
                System.out.println("Произведение равно: " + result);
                break;
            case '/' :
                result = firstNumber / secondNumber;
                System.out.println("Отношение равно: " + result);
                break;
            case '%' :
                result = firstNumber % secondNumber;
                System.out.println("Остаток от деления: " + result);
                break;
            case '^' :
                result = 1;
                for (int i = 0; i < secondNumber; i++) {
                    result *= firstNumber;
                }
                System.out.println("Возведение в степень: " + result);
                break;
            default :
                System.out.println("Операция не распознана! Попробуйте ещё раз.");
                calc(firstNumber, operation, secondNumber);
                break;
        }
    }
}