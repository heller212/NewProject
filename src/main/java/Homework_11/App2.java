package Homework_11;

import java.util.Arrays;

public class App2 {
    public static void main(String[] args) {


        Orange orange1 = new Orange();
        Orange orange2 = new Orange();
        Orange orange3 = new Orange();
        Orange orange4 = new Orange();


        Apple apple1 = new Apple();
        Apple apple2 = new Apple();
        Apple apple3 = new Apple();
        Apple apple4 = new Apple();
        Apple apple5 = new Apple();

        Box<Orange> boxOr1 = new Box<>(new Orange[]{orange1, orange2, orange3, orange4});
        Box<Apple> boxApp1 = new Box<>(new Apple[]{apple1,apple2});
        Box<Apple> boxApp2 = new Box<>(new Apple[]{apple3, apple4, apple5});

        System.out.println(boxApp1.compare(boxOr1));

        boxApp2.getFruit();
        boxApp1.trowFruit(boxApp2);
        boxApp2.getFruit();

        System.out.println(boxApp1.getWeight());


    }
}
