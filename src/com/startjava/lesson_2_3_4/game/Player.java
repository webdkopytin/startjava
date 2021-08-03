package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;

public class Player {

    private final String name;
    private int countAttempts;
    private final int[] numbers = new int[GuessNumber.MAX_COUNT_ATTEMPTS];

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setNumber(int number) {
        numbers[countAttempts++] = number;
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