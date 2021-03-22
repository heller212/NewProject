package Homework_7;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Cat [] cats = new Cat[3];
        cats[0] = new Cat("Барсик", 20);
        cats[1] = new Cat("Мурзик", 40);
        cats[2] = new Cat("Мурка", 15);

        Plate plate1 = new Plate(0);

        plate1.increaseFood();

        for (int i = 0; i < cats.length; i++) {
            cats[i].happyMeal(plate1);
            cats[i].eat(plate1);
            cats[i].info();
        }



    }
}
