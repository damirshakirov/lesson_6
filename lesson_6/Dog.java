package ru.geekbrains.lesson_6;

public class Dog extends Animal {
    @Override
    public void eat() {
        System.out.println("Собака кушает");
    }

    @Override
    public void voice() {
        System.out.println("Собака лает");
    }

}
