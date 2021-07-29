package com.startjava.lesson_1.calculator;

public class Calculator {
    public static void main(String[] args) {
        char operation = '^';
        int firstNumber = 5;
        int secondNumber = 5;

        if (operation == '+') {
            System.out.println(firstNumber + " " + operation + " " + secondNumber + " = " + (firstNumber + secondNumber));
        } else if (operation == '-') {
            System.out.println(firstNumber + " " + operation + " " + secondNumber + " = " + (firstNumber - secondNumber));
        } else if (operation == '*') {
            System.out.println(firstNumber + " " + operation + " " + secondNumber + " = " + (firstNumber * secondNumber));
        } else if (operation == '/') {
            System.out.println(firstNumber + " " + operation + " " + secondNumber + " = " + (firstNumber / secondNumber));
        } else if (operation == '^') {
            int result = 1;
            for (int i = 1; i <= secondNumber; i++) {
                result *= firstNumber;
            }
            System.out.println(firstNumber + " " + operation + " " + secondNumber + " = " + result);
        } else if (operation == '%') {
            System.out.println(firstNumber + " " + operation + " " + secondNumber + " = " + (firstNumber % secondNumber));
        }
        
    }
}