package Homework_8;

public class Cat implements Actions{
    private String name;
    private final int MAX_JUMP = 9;
    private final int MAX_RUN = 10;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public void run(Obstacle n) {
        if (MAX_RUN >= n.getDifficulty()) {
            System.out.println("Кот " + name + " успешно пробежал.");
        } else {
            System.out.println("Кот " + name + " не смог столько пробежать.");
        }
    }

    @Override
    public void jump(Obstacle m) {
        if (MAX_JUMP >= m.getDifficulty()) {
            System.out.println("Кот " + name + " успешно запрыгнул.");
        } else {
            System.out.println("Кот " + name + " так высоко не прыгает.");
        }
    }

    @Override
    public boolean checkRun(Obstacle m) {
        return MAX_RUN >= m.getDifficulty();
    }

    @Override
    public boolean checkJump(Obstacle n) {
        return MAX_JUMP >= n.getDifficulty();
    }

}
