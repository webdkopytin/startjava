package com.startjava.lesson_2_3_4.game;

import java.util.Scanner;

public class GuessNumber {

    public static final int MAX_COUNT_ATTEMPTS = 10;

    private final Player firstPlayer;
    private final Player secondPlayer;
    private int secretNumber;

    public GuessNumber(Player firstPlayer, Player secondPlayer) {
        this.firstPlayer = firstPlayer;
        this.secondPlayer = secondPlayer;
    }

    public void startGame() {
        firstPlayer.clearNumbers();
        secondPlayer.clearNumbers();

        System.out.println("У каждого из игроков " + MAX_COUNT_ATTEMPTS + " попыток");

        generateSecretNumber();
        boolean isWin = false;
        Player currentPlayer = firstPlayer;
        while (currentPlayer.getCountAttempts() != MAX_COUNT_ATTEMPTS && !isWin) {
            System.out.print("Число вводит игрок с именем " + currentPlayer.getName() + ": ");
            int playerNumber = enterNumber(currentPlayer);

            if (playerNumber != secretNumber) {
                String moreLess = playerNumber > secretNumber ? "больше" : "меньше";
                System.out.println("Данное число " + moreLess + " того, что загадал компьютер!");

                currentPlayer = currentPlayer == firstPlayer ? secondPlayer : firstPlayer;
            } else {
                System.out.println(System.lineSeparator() + "Игрок " + currentPlayer.getName() +
                        " угадал число " + playerNumber + " с " +
                        currentPlayer.getCountAttempts() + " попытки" + System.lineSeparator());
                isWin = true;
            }
        }

        if (currentPlayer.getCountAttempts() == MAX_COUNT_ATTEMPTS && !isWin) {
            System.out.println(System.lineSeparator() + "У игрока " + currentPlayer.getName() +
                    " закончились попытки" + System.lineSeparator());
        }

        System.out.print("Игрок " + firstPlayer.getName() + " назвал числа: ");
        printNumbers(firstPlayer);
        System.out.print(System.lineSeparator() + "Игрок " + secondPlayer.getName() +
                " назвал числа: ");
        printNumbers(secondPlayer);
    }

    private void generateSecretNumber() {
        secretNumber = (int) (Math.random() * 100) + 1;
        System.out.println(System.lineSeparator() + "Компьютер загадал число." + "  (число - " +
                secretNumber + ")");
    }

    private int enterNumber(Player player) {
        int number = new Scanner(System.in).nextInt();
        player.setNumber(number);
        return number;
    }

    private void printNumbers(Player player) {
        for (int number : player.getNumbers()) {
            System.out.print(number + " ");
        }
    }
}