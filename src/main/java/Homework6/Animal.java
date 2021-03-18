package Homework6;

public abstract class Animal {
    String name;
    private static int counter = 0;

    public Animal(String name) {
        counter++;
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void run(int meters) {
    }

    public void swim(int meters) {
        if (meters <= 0) {
            System.out.println("Дистанция должна быть больше 0 метров.");
        }
    }

    public static int getCounter() {
        return counter;
    }
}
