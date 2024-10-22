package racingcar;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * CarTest
 */
public class CarTest {

    @Test
    void car_move_or_stop() {
        Car car = new Car("benltey");

        car.moveOrStop();

        Assertions.assertThat(car.getProgress()).isIn(0, 1);
    }

    @Test
    void car_print_status() {
        Car car = new Car("benltey");

        car.moveOrStop();

        Assertions.assertThat(car.toString()).isIn("benltey : ", "benltey : -");
    }
}
