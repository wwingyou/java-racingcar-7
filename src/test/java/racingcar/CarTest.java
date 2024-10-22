package racingcar;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * CarTest
 */
public class CarTest {

    final StaticRandomGenerator randomGenerator = new StaticRandomGenerator();

    @Test
    void car_move() {
        Car car = new Car("benltey", randomGenerator);
        randomGenerator.setStaticNumber(9);

        car.moveOrStop();

        Assertions.assertThat(car.getProgress()).isEqualTo(1);
    }

    @Test
    void car_stop() {
        Car car = new Car("benltey", randomGenerator);
        randomGenerator.setStaticNumber(0);

        car.moveOrStop();

        Assertions.assertThat(car.getProgress()).isEqualTo(0);
    }

    @Test
    void car_print_status() {
        Car car = new Car("benltey", randomGenerator);
        randomGenerator.setStaticNumber(9);

        car.moveOrStop();
        car.moveOrStop();
        car.moveOrStop();

        Assertions.assertThat(car.toString()).isEqualTo("benltey : ---");
    }
}
