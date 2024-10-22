package racingcar;

import camp.nextstep.edu.missionutils.Randoms;

/**
 * MissionRandomGenerator
 */
public class MissionRandomGenerator implements RandomGenerator {

    private static MissionRandomGenerator instance;

    private MissionRandomGenerator() {}

    public static MissionRandomGenerator getInstance() {
        if (instance == null) {
            instance = new MissionRandomGenerator();
        }
        return instance;
    }

    @Override
    public int getRandomNumber() {
        return Randoms.pickNumberInRange(0, 9);
    }

}
