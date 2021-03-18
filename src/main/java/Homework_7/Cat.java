package Homework_7;

public class Cat {
    private String name;
    private int appetite;
    private boolean satiety = false;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public void eat (Plate p) {
        p.decreaseFood(appetite);
    }

    public void happyMeal (Plate p) {
        if (appetite <= p.getFood()) {
            satiety = true;
        }
    }

    public void info() {
        if (satiety) {
            System.out.println("Котик " + name + " наелся.");
        } else {
            System.out.println("Котик " + name + " остался голодным.");
        }
    }
}
