package racingcar;


import java.util.ArrayList;
import java.util.List;


public class Application {
    public static void main(String[] args) {
        //자동차 이름 입력 받기
//        String[] input = CarNameCheck.nameString();
//        HashMap<String, Integer> carNameValue = new HashMap<>();
//        List<Integer> sucessList = new ArrayList<>();   //성공이 담길 횟수
//
//        //자동차 이름, 성공횟수 담기
//        int mapSize = 0;    //map 크기
//        for(String name : input) {
//            carNameValue.put(name, 0);
//            mapSize++;
//        }
//        System.out.println("시도할 횟수는 몇 회인가요?");
//        int count = Integer.parseInt(Console.readLine());
//
//        Randoms Random = null;
//        int number = 0; //무작위 값
//
//        for(int i=1; i<=count; i++) {
//            for(int j=1; j<=mapSize; j++ ) {
//                number = Random.pickNumberInRange(0, 9);
//                if(number<4) {
//                    sucessList.add(0);
//                } else {
//                    sucessList.add(1);
//                }
//                System.out.println("");
//            }
//
//        }
        //자동차 이름 입력 받기
        String[] carNames = Input.inputCarNames();

        //경주 횟수 입력
        int count = Input.numberOfRace();

        //자동차 이름이 담긴 리스트 and 결과가 담길 리스트
        List<Car> cars = new ArrayList<>();      //자동차이름    팩토리 패턴, 팩토리 클래스
        for(String carName : carNames) {
            cars.add(new Car(carName));
        }


        List<String> raceResult = new ArrayList<>();    //레이스 결과 이기면 -저장
        List<Integer> winCount = new ArrayList<>();     //우승횟수 카운트

//        setRaceInfo(names, carNames, raceResult, winCount);
//
//        //경주 횟수만큼 진행하기
//        int randomNum = 0;
//        for(int i=1; i<=count; i++) {                   //입력한 횟수만큼
//            for(int j=0; j<carNames.size(); j++) {      //자동차 특정하기 위해
//                String carName = carNames.get(j);
//                randomNum = Randoms.pickNumberInRange(0, 9);
//                System.out.print(carName + " : ");
//                if(randomNum>=4) {                              //결과 성공일 경우에 해당 인덱스번호에 있는ㄷ
//                    raceResult.set(j, raceResult.get(j) + "-");
//                    winCount.set(j,winCount.get(j) + 1);
//                }
//                System.out.print(raceResult.get(j));
//                System.out.println();
//            }
//            System.out.println();
//        }
//        //우승자 찾기
//
//        int maxWinNum = 0;
//        String winners = "";
//        for(int i=0; i<winCount.size(); i++) {
//            int winNum = winCount.get(i);
//
//            if(maxWinNum < winNum) {
//                maxWinNum = winNum;
//                winners = carNames.get(i);
//            } else if(maxWinNum == winNum) {
//                winners = winners + ", " + carNames.get(i);
//            }
//        }
//
//        System.out.print("최종 우승자 : " + winners);
//    }
//
//    private static void setRaceInfo(String[] names, List<String> carNames, List<String> raceResult, List<Integer> winCount) {
//        for(String name : names) {
//            carNames.add(name);
//            raceResult.add("");
//            winCount.add(0);
//        }
//    }
    }
}
