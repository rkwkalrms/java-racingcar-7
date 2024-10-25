package racingcar;

public class ValidateException {

    public static void carNameValidateNEmpty(String carName) {
        if(carName == null || carName.isEmpty()) {
            throw new IllegalArgumentException("입력 값이 비어있습니다.");
        }
    }

    public static void carNameValidateLength(String carName) {
        if(carName.length() > 5) {
            throw new IllegalArgumentException("입력한 이름 '" + carName + "'이 5자를 초과한 것이 있습니다.");
        }
    }


}
