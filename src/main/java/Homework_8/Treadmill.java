package Homework_8;

public class Treadmill implements Obstacle{
    private final int MAX_LENGTH = 20;
    private final int difficulty;

    public Treadmill(int difficulty) {
        this.difficulty = difficulty;
    }

    @Override
    public int getDifficulty() {
        return difficulty;
    }
}
