import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);

        String question = "yes";

        while(question.equals("yes")) {
            System.out.print("Введите первое число: ");
            calculator.setFirstInt(scanner.nextInt());

            System.out.print("Введите знак математической операции: ");
            calculator.setOperation(scanner.next().charAt(0));

            System.out.print("Введите второе число: ");
            calculator.setSecondInt(scanner.nextInt());

            calculator.calc();

            do {
                System.out.print("Хотите продолжить вычисления? [yes/no]: ");
                question = scanner.next();
            } while (!question.equals("yes") && !question.equals("no"));
        } 
    }
}