package Homework_7;

import java.util.Scanner;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public int getFood() {
        return food;
    }

    public void info() {
        System.out.println("В миске осталось  " + food + " единиц еды.");
    }

    public void decreaseFood(int n) {
        if(food < n) {
            System.out.println("В миске слишком мало еды.");
        } else {
            food -= n;
        }
    }

    public void increaseFood() {
        System.out.println("Насыпьте котикам еды.");
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        if (m < 0) {
            System.out.println("Не забирайте еду из миски!");
        } else {
            food += m;
        }
    }
}
