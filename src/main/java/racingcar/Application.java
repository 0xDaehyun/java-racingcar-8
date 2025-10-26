package racingcar;


public class Application {
    public static void main(String[] args) {

        var names = InputView.readCarNames();  // 자동차의 이름을 입력받는다. (함수로 분리)
        int tryCount = InputView.readTryCount(); // 게임할 횟수를 입력 받는다.

        // 여러 자동차를 관리하는 객체와 각각의 자동차에 대한 객체를 생성한다.
        Cars cars = new Cars(names);

        RandomMovePolicy policy = new RandomMovePolicy();

        // 게임 시작
        Game.run(cars, tryCount, policy);

    }
}