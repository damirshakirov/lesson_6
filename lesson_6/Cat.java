package ru.geekbrains.lesson_6;

public class Cat extends Animal {
    @Override
    public void eat() {
        System.out.println("Кошка кушает");
    }

    @Override
    public void voice() {
        System.out.println("Кошка лает");
    }

}
