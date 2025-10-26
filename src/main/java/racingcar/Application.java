package racingcar;


public class Application {
    public static void main(String[] args) {

        var names = InputView.readCarNames();  // 자동차의 이름을 입력받는다. (함수로 분리)
        int tryCount = InputView.readTryCount(); // 게임할 횟수를 입력 받는다.
    }
}