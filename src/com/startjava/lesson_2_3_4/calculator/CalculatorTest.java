package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);

        String answer = "yes";

        while (answer.equals("yes")) {
            System.out.print("Введите математическое выражение: ");
            String mathExpression = scanner.nextLine();
            System.out.println(mathExpression + " = " + calculator.calculate(mathExpression));

            do {
                System.out.print("Хотите продолжить вычисления? [yes/no]: ");
                answer = scanner.nextLine();
            } while (!answer.equals("yes") && !answer.equals("no"));
        }
    }
}