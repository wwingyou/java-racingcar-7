package racingcar;

import camp.nextstep.edu.missionutils.Randoms;
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
        int randomNumber = Randoms.pickNumberInRange(0, 9);
        if (randomNumber >= 4) {
            progress += 1;
        }
    }

    @Override
    public String toString() {
        // TODO: implement method
        return "";
    }

    public String getName() {
        return name;
    }

    public int getProgress() {
        return progress;
    }
}
