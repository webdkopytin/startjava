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

    public double calculate(String mathExpression) {

        String[] arrayExpression = mathExpression.split(" ");
        setFirstNumber(Integer.parseInt(arrayExpression[0]));
        setOperation(arrayExpression[1].charAt(0));
        setSecondNumber(Integer.parseInt(arrayExpression[2]));

        switch (operation) {
            case '+':
                return Math.addExact(firstNumber, secondNumber);
            case '-':
                return Math.subtractExact(firstNumber, secondNumber);
            case '*':
                return Math.multiplyExact(firstNumber, secondNumber);
            case '/':
                return (double) firstNumber / secondNumber;
            case '%':
                return firstNumber % secondNumber;
            case '^':
                return (int) Math.pow(firstNumber, secondNumber);
        }
        return Double.MAX_VALUE;
    }
}