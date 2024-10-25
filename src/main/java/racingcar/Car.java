package racingcar;

class Car {
    private String carName;
    private int sucessMoveDistance;

    public Car(String carName) {
        this.carName = carName;
        this.sucessMoveDistance = 0;
    }

    public void move(int ramdomNumber) {
        if (ramdomNumber >= 4) {
            this.sucessMoveDistance++;
        }
    }

    public String getCarName() {
        return carName;
    }

    public int getSucessMoveDistance() {
        return sucessMoveDistance;
    }

    @Override
    public String toString() {
        return carName + " : " + "-".repeat(sucessMoveDistance);
    }
}
