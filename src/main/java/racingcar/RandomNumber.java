package racingcar;

import camp.nextstep.edu.missionutils.Randoms;

public class RandomNumber {


    public static int randomNumber() {
        int number = Randoms.pickNumberInRange(0, 9);
        return number;
    }
}
