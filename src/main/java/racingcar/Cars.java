package racingcar;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Cars {

    private final List<Car> cars;

    public Cars(List<String> names) { // 자동차 이름 리스트를 받아 각 자동차의 이름으로 자동차 객체를 만든다
        this.cars = new ArrayList<>();
        for (String name : names) {
            this.cars.add(new Car(name));
        }
    }

    public void raceOnce(MovePolicy policy) {
        for (Car car : cars) {
            car.move(policy.canMove());
        }
    }

    public List<Car> getCars() {
        return cars;
    }

    public List<String> winners() {
        int max = maxPosition();
        return cars.stream()
                .filter(car -> car.getPosition() == max)
                .map(Car::getName)
                .collect(Collectors.toList());
    }

    private int maxPosition() {
        int max = 0;
        for (Car car : cars) {
            if (car.getPosition() > max) {
                max = car.getPosition();
            }
        }
        return max;
    }
}