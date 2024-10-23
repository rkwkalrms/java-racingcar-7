package racingcar;

import camp.nextstep.edu.missionutils.Console;

public class Input {

    public static String[] inputCarNames() {
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분");
        String[] names = Console.readLine().replace(" ", "").split(",");

        for(String name : names) {
            carNameLengthCheck(name);
        }
        return names;
    }
    //검증 클래스 따로 분리하기
    private static void carNameLengthCheck(String name) {
        if(name.length() > 5) {
            throw new IllegalArgumentException("입력한 이름 '" + name + "'이 5자를 초과한 것이 있습니다.");
        }
    }
    //검증 클래스 따로 분리하기
    public static int numberOfRace() {
        System.out.println("시도할 횟수는 몇 회인가요?");
        try {
            int num = Integer.parseInt(Console.readLine());
            return num;
        } catch(NumberFormatException e) {
            throw new IllegalArgumentException("유효하지 않은 입력입니다.");
        }
    }
}
