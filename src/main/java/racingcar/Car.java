package racingcar;

/**
 * Car
 */
public class Car {

    private String name;
    private int progress;
    private RandomGenerator randomGenerator;

    public Car(String name, RandomGenerator randomGenerator) {
        this.name = name;
        this.randomGenerator = randomGenerator;
    }

    public void moveOrStop() {
        int randomNumber = randomGenerator.getRandomNumber();
        if (randomNumber >= 4) {
            progress += 1;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < progress; i++) {
            sb.append('-');
        }
        return name + " : " + sb.toString();
    }

    public String getName() {
        return name;
    }

    public int getProgress() {
        return progress;
    }
}
