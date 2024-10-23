package racingcar;

import camp.nextstep.edu.missionutils.Randoms;

public class Race {

    public int tryForward(int count) {
        Randoms Random = null;
        int number = 0;
        for(int i=1; i<=count; i++) {
            number = Random.pickNumberInRange(0, 9);
            if(number >= 4) {
                runForward();
            }
        }
        return number;
    }

    private void runForward() {

    }
}
