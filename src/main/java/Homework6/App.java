package Homework6;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Animal kitty = new Cat("Мурка");
        Dog doggo = new Dog("Бобик");
        Dog push = new Dog("Чижик");
        Cat purr = new Cat("Мурзик");
        Animal x = new Dog("Жучка");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длину дистанции для забега.");
        int runMeters = scanner.nextInt();
        doggo.run(runMeters);
        kitty.run(runMeters);

        System.out.println("Введите длину дистанции для заплыва.");
        int swimMeters = scanner.nextInt();
        doggo.swim(swimMeters);
        kitty.swim(swimMeters);

        System.out.println("Всего животных: " + Animal.getCounter());
        System.out.println("Собак: " + Dog.getDogCounter());
        System.out.println("Кошек: " + Cat.getCatCounter());
    }
}
