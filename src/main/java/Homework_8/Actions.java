package Homework_8;

public interface Actions {

    void run(Obstacle n);
    void jump(Obstacle m);
    boolean checkRun(Obstacle m);
    boolean checkJump(Obstacle n);

}
