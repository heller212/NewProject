package Homework_8;

public class Wall implements Obstacle{
    private final int MAX_SIZE = 10;
    private final int difficulty;

    public Wall(int difficulty) {
        this.difficulty = difficulty;
    }

    @Override
    public int getDifficulty() {
        return difficulty;
    }
}
