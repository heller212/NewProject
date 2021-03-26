package Homework_8;

public class Human implements Actions {
    private final int MAX_JUMP = 4;
    private final int MAX_RUN = 12;
    private String name;


    public Human(String name) {
        this.name = name;
    }

    @Override
    public void run(Obstacle n) {
        if (MAX_RUN >= n.getDifficulty()){
            System.out.println("Человек " + name + " успешно пробежал.");
        } else{
            System.out.println("Человек " + name + " не смог столько пробежать.");
        }
    }

    @Override
    public void jump(Obstacle m) {
        if (MAX_JUMP >= m.getDifficulty()) {
            System.out.println("Человек " + name + " запрыгнул.");
        } else {
            System.out.println("Человек " + name + " так высоко не прыгает.");
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
