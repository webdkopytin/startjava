package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);

        String question = "yes";

        while(question.equals("yes")) {
            System.out.print("Введите математическое выражение: ");
            String mathematicalExpression = scanner.nextLine();
            String[] arrayExpression = mathematicalExpression.split(" ");
            calculator.setFirstNumber(Integer.parseInt(arrayExpression[0]));
            calculator.setOperation(arrayExpression[1].charAt(0));
            calculator.setSecondNumber(Integer.parseInt(arrayExpression[2]));
            calculator.calc();

            do {
                System.out.print("Хотите продолжить вычисления? [yes/no]: ");
                question = scanner.nextLine();
            } while (!question.equals("yes") && !question.equals("no"));
        } 
    }
}