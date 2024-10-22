package racingcar;

import java.util.ArrayList;
import java.util.List;

/**
 * Game
 */
public class Game {

    List<Car> cars = new ArrayList<>();

    public Game() {}

    public void addCar(String name) {
        this.addCar(name, MissionRandomGenerator.getInstance());
    }

    public void addCar(String name, RandomGenerator randomGenerator) {
        Car car = new Car(name, randomGenerator);
        cars.add(car);
    }

    public void progress() {
        for (Car car: cars) {
            car.moveOrStop();
        }
    }

    public List<Car> getWinners() {
        int maxProgress = 0;
        List<Car> winners = new ArrayList<>();
        for (Car car: cars) {
            if (car.getProgress() > maxProgress) {
                winners.clear();
                winners.add(car);
                maxProgress = car.getProgress();
            } else if (car.getProgress() == maxProgress) {
                winners.add(car);
            }
        }

        return winners;
    }

    public List<Car> getCars() {
        return cars;
    }

}
