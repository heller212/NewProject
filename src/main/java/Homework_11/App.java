package Homework_11;

import java.util.Arrays;


public class App {
    public static void main(String[] args) {

        /*
        Написать метод, который меняет два элемента массива местами
        (массив может быть любого ссылочного типа);
        Написать метод, который преобразует массив в ArrayList.
        */

        Integer[] intArr = new Integer[4];
        intArr[0] = 5;
        intArr[1] = 89;
        intArr[2] = 3;
        intArr[3] = 54;

        Elements testEl = new Elements(intArr);

        testEl.makeAnArray();

        testEl.replace(2, 3);

        System.out.println(Arrays.toString(testEl.getObject()));

    }
}
