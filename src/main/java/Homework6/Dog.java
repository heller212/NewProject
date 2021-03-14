package Homework6;

public class Dog extends Animal{
    private static int dogCounter = 0;
    public Dog(String name) {
        super(name);
        dogCounter++;
    }


    @Override
    public void run(int meters) {
        super.run(meters);
        if (meters <= 0) {
            System.out.println("Дистанция должна быть больше 0 метров.");
        }else if(meters < 500) {
            System.out.println("Пес " + name + " пробежал " + meters + " метров.");
        } else {
            System.out.println("Пес " + name + " не смог столько пробежать.");
        }
    }

    @Override
    public void swim(int meters) {
        super.swim(meters);
        if (meters <= 0) {
            System.out.println("Дистанция должна быть больше 0 метров.");
        }else if(meters < 10) {
            System.out.println("Пес " + name + " проплыл " + meters + " метров.");
        } else {
            System.out.println("Пес " + name + " не смог столько проплыть.");
        }
    }
    public static int getDogCounter(){
        return dogCounter;
    }
}
