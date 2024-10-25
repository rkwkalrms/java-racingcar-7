package racingcar;


import java.util.List;


public class Application {
    public static void main(String[] args) {
        //자동차 이름 입력 받기
        String[] carNames = Input.inputCarNames();

        //경주 횟수 입력
        int raceCount = Input.raceCount();

        //경주 진행
        Race race = new Race(List.of(carNames), raceCount);
        race.startRace();
        race.printWinners();

    }
//클래스명 다시 고민, Race클래스 좀더 객체 지향적으로 코드 개편 (이름을 다시 짓고 클래스 나눠보기 ex)InputHandler, Output)
}
