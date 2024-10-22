package racingcar;

import camp.nextstep.edu.missionutils.Randoms;

/**
 * MissionRandomGenerator
 */
public class MissionRandomGenerator implements RandomGenerator {

    @Override
    public int getRandomNumber() {
        return Randoms.pickNumberInRange(0, 9);
    }

}
