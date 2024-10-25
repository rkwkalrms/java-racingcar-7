package racingcar;

import java.util.ArrayList;
import java.util.List;

class Race {
    private List<Car> cars;
    private int raceCount;

    public Race(List<String> carNames, int raceCount) {
        this.cars = new ArrayList<>();
        this.raceCount = raceCount;

        for (String carName : carNames) {
            cars.add(new Car(carName));
        }
    }

    public void startRace() {
        for (int round = 1; round <= raceCount; round++) {
            tryToMove();
            printRaceMoveStatus();
        }
    }

    private void printRaceMoveStatus() {
        for (Car car : cars) {
            System.out.println(car);
        }
    }

    private void tryToMove() {
        for (Car car : cars) {
            int randomNumber = RandomNumber.randomNumber();
            car.move(randomNumber);
        }
    }

    public void printWinners() {
        int maxDistance = 0;
        List<String> winners = new ArrayList<>();

        for (Car car : cars) {
            int distance = car.getSucessMoveDistance();
            if (distance > maxDistance) {
                maxDistance = distance;
                winners.clear();
                winners.add(car.getCarName());
            } else if (distance == maxDistance) {
                winners.add(car.getCarName());
            }
        }
        System.out.println("\n최종 우승자 : " + String.join(", ", winners));
    }
}
