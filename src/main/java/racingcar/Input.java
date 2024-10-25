package racingcar;

import camp.nextstep.edu.missionutils.Console;


public class Input {

    public static String[] inputCarNames() {
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        String[] carNames = Console.readLine().replace(" ", "").split(",");

        for(String carName : carNames) {
            ValidateException.carNameValidateNEmpty(carName);
            ValidateException.carNameValidateLength(carName);
        }
        return carNames;
    }
    //검증 클래스 따로 분리하기
    public static int raceCount() {
        System.out.println("시도할 횟수는 몇 회인가요?");
        try {
            int num = Integer.parseInt(Console.readLine());
            return num;
        } catch(NumberFormatException e) {
            throw new IllegalArgumentException("유효하지 않은 입력입니다.");
        }
    }
}
