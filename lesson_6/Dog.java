package ru.geekbrains.lesson_6;

public class Dog extends Animal {
    @Override
    public void run(int distance) {
        if (distance > 500) System.out.println("Собака не может пробежать больше 500 м.");
        else System.out.println("Собака пробежала " + distance + " м.");
    }

    @Override
    public void jump(int height) {
        if (height > 0.5) System.out.println("Собака не может прыгнуть выше 0.5 м.");
        else System.out.println("Собака прыгнула на " + height + " м.");
    }

    @Override
    public void swim(int distance) {
        if (distance > 10) System.out.println("Собака не может проплыть больше 10 м.");
        else System.out.println("Собака проплыла " + distance + " м.");
    }
}
