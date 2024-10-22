package racingcar;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.jupiter.api.Test;

/**
 * GameTest
 */
public class GameTest {

    private final StaticRandomGenerator zeroGenerator = new StaticRandomGenerator(0);
    private final StaticRandomGenerator nineGenerator = new StaticRandomGenerator(9);

    @Test
    void set_cars() {
        Game game = new Game();

        game.addCar("bentley");
        game.addCar("genesis");
        game.addCar("mini");

        assertThat(game.getCars()).size().isEqualTo(3);
    }

    @Test
    void move_cars() {
        Game game = new Game();
        game.addCar("bentley", nineGenerator);
        game.addCar("genesis", nineGenerator);
        game.addCar("mini", zeroGenerator);

        game.progress();
        game.progress();
        game.progress();

        List<Car> cars = game.getCars();
        assertThat(cars.get(0).getProgress()).isEqualTo(3);
        assertThat(cars.get(1).getProgress()).isEqualTo(3);
        assertThat(cars.get(2).getProgress()).isEqualTo(0);
    }

    @Test
    void find_winners() {
        Game game = new Game();
        game.addCar("bentley", nineGenerator);
        game.addCar("genesis", nineGenerator);
        game.addCar("mini", zeroGenerator);

        game.progress();
        game.progress();
        game.progress();

        List<Car> winners = game.getWinners();
        assertThat(winners).size().isEqualTo(2);
        assertThat(winners.get(0).getName()).isEqualTo("bentley");
        assertThat(winners.get(1).getName()).isEqualTo("genesis");
    }
}