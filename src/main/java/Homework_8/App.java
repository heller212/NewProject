package Homework_8;

public class App {
    public static void main(String[] args) {

        Obstacle[] training = new Obstacle[4];
        training[0] = new Treadmill(4);
        training[1] = new Wall(5);
        training[2] = new Wall(9);
        training[3] = new Treadmill(12);

        Actions[] crew = new Actions[4];
        crew[0] = new Cat("Мурзик");
        crew[1] = new Human("Иван");
        crew[2] = new Robot("R3456");
        crew[3] = new Human("Георгий");

        for (int i = 0; i < training.length; i++) {
            if(training[i] instanceof Wall) {
                System.out.println("Высота стены " + training[i].getDifficulty());
            }
            if (training[i] instanceof Treadmill) {
                System.out.println("Длина дорожки " + training[i].getDifficulty());
            }
        }

        System.out.println();


        for (int i = 0; i < crew.length; i++) {
            for (int j = 0; j < training.length; j++) {
                if (training[j] instanceof Wall) {
                    crew[i].jump(training[j]);
                    if (!crew[i].checkJump(training[j])) {
                        break;
                    }
                }
                if (training[j] instanceof Treadmill) {
                    crew[i].run(training[j]);
                    if (!crew[i].checkRun(training[j])) {
                        break;
                    }
                }
            } System.out.println();
        }
    }

}
