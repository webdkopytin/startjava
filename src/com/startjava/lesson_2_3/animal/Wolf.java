package com.startjava.lesson_2_3.animal;

public class Wolf {
    String gender;
    String nickname;
    float weight;
    int age;
    String color;

    void go() {
        System.out.println("Пройдено несколько метров");
    }

    boolean sit() {
        System.out.println("Присел");
        return true;
    }

    void run() {
        System.out.println("Совершена пробежка на небольшое расстояние");
    }

    void howl() {
        System.out.println("Повыл на луну");
    }

    boolean hunt() {
        System.out.println("Охота начата");
        return true;
    }
}