package com.startjava.lesson_2_3_4.calculator;

public class Calculator {
    private int firstNumber;
    private char operation;
    private int secondNumber;

    public void setFirstNumber(int firstNumber) {
        this.firstNumber = firstNumber;
    }

    public void setOperation(char operation) {
        this.operation = operation;
    }

    public void setSecondNumber(int secondNumber) {
        this.secondNumber = secondNumber;
    }

    public void calc() {
        int result;
        switch(operation) {
            case '+' :
                result = Math.addExact(firstNumber, secondNumber);
                System.out.println("Сумма равна: " + result);
                break;
            case '-' :
                result = Math.subtractExact(firstNumber, secondNumber);
                System.out.println("Разность равна: " + result);
                break;
            case '*' :
                result = Math.multiplyExact(firstNumber, secondNumber);
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
                result = (int) Math.pow(firstNumber, secondNumber);
                System.out.println("Возведение в степень: " + result);
                break;
            default :
                System.out.println("Операция не распознана! Попробуйте ещё раз.");
        }
    }
}