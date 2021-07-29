package com.startjava.lesson_1.game;

public class MyFirstGame {
    public static void main(String[] args) {
        int hiddenNumber = 15;
        int playerNumber = 18;

        if (playerNumber <= hiddenNumber) {
            for (int i = playerNumber; i <= hiddenNumber; i++) {
                if (i == hiddenNumber) {
                    System.out.println("Поздравляю, число (" + i + ") угадано!");
                } else {
                    System.out.println("Данное число (" + i + ") меньше того, что загадал компьютер");
                }
            }
        } else {
            for (int i = playerNumber; i >= hiddenNumber; i--) {
                if (i == hiddenNumber) {
                    System.out.println("Поздравляю, число (" + i + ") угадано!");
                } else {
                    System.out.println("Данное число (" + i + ") больше того, что загадал компьютер");
                }
            }
        }
    }
}