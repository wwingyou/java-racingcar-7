package racingcar;

import static camp.nextstep.edu.missionutils.test.Assertions.assertRandomNumberInRangeTest;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * CarTest
 */
public class CarTest {

    private final static int MOVE = 9;
    private final static int STOP = 0;

    @Test
    void car_move() {
        Car car = new Car("benltey");

        assertRandomNumberInRangeTest(() -> {
            car.moveOrStop();
        }, MOVE);

        Assertions.assertThat(car.getProgress()).isEqualTo(1);
    }

    @Test
    void car_stop() {
        Car car = new Car("benltey");

        assertRandomNumberInRangeTest(() -> {
            car.moveOrStop();
        }, STOP);

        Assertions.assertThat(car.getProgress()).isEqualTo(0);
    }

    @Test
    void car_print_status() {
        Car car = new Car("benltey");

        assertRandomNumberInRangeTest(() -> {
            car.moveOrStop();
            car.moveOrStop();
            car.moveOrStop();
        }, MOVE, STOP, MOVE);

        Assertions.assertThat(car.toString()).isEqualTo("benltey : --");
    }
}
