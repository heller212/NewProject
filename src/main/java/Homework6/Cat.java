package Homework6;

public class Cat extends Animal {
    private static int catCounter = 0;
    public Cat(String name) {
        super(name);
        catCounter++;
    }


    @Override
    public void run(int meters) {
        super.run(meters);
        if (meters <= 0) {
            System.out.println("Дистанция должна быть больше 0 метров.");
        } else if(meters < 200) {
            System.out.println("Кот " + name + " пробежал " + meters + " метров.");
        } else {
            System.out.println("Кот " + name + " не смог столько пробежать.");
        }
    }

    @Override
    public void swim(int meters) {
        super.swim(meters);
        if (meters <= 0) {
            System.out.println("Дистанция должна быть больше 0 метров.");
        } else {
            System.out.println("Кот " + name + " не умеет плавать.");
        }
    }

    public static int getCatCounter() {
        return catCounter;
    }
}
