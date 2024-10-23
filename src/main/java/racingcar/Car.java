package racingcar;

import static camp.nextstep.edu.missionutils.Randoms.pickNumberInRange;

/**
 * Car
 */
public class Car {

    private String name;
    private int progress;

    public Car(String name) {
        this.name = name;
    }

    public void moveOrStop() {
        int randomNumber = pickNumberInRange(0, 9);
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
