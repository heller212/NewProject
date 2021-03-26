package Homework_8;

public class Robot implements Actions{
    private String model;
    private final int MAX_JUMP = 5;
    private final int MAX_RUN = 18;

    public Robot(String model) {
        this.model = model;
    }

    @Override
    public void run(Obstacle n) {
        if (MAX_RUN >= n.getDifficulty()) {
            System.out.println("Робот " + model + " успешно пробежал.");
        } else {
            System.out.println("Робот " + model + " не смог столько пробежать.");
        }

    }

    @Override
    public void jump(Obstacle m) {
        if (MAX_JUMP >= m.getDifficulty()) {
            System.out.println("Робот " + model + " успешно запрыгнул.");
        } else {
            System.out.println("Робот " + model + " так высоко не прыгает.");
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
