package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;

public class Player {

    private final String name;
    private int countAttempts = 0;
    private final int[] numbers = new int[GuessNumber.MAX_COUNT_ATTEMPTS];

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setNumbers(int playerNumber) {
        numbers[countAttempts++] = playerNumber;
    }

    public int[] getNumbers() {
        return Arrays.copyOf(numbers, countAttempts);
    }

    public int getCountAttempts() {
        return countAttempts;
    }

    public void clearNumbers() {
        Arrays.fill(numbers, 0, countAttempts, 0);
        countAttempts = 0;
    }
}