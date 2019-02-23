package ru.geekbrains.lesson_6;

public class Cat extends Animal {
    @Override
    public void run(int distance) {
        if (distance > 200) System.out.println("Кот не может пробежать больше 200 м.");
        else System.out.println("Кошка пробежала " + distance + " м.");
    }

    @Override
    public void swim(int distance) {
        System.out.println("Кот не умеет плавать");
    }

    @Override
    public void jump(int height) {
        if (height > 2) System.out.println("Кот не может прыгнуть выше 2 м.");
        else System.out.println("Кот прыгнул на " + height + " м.");
    }
}
