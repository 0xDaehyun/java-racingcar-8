package racingcar;

public class Game {

    public static void run(Cars cars, int tryCount, MovePolicy policy) {
        System.out.println();
        System.out.println("실행 결과");

        for (int i = 0; i < tryCount; i++) {
            cars.raceOnce(policy);
            ResultView.printRound(cars);
        }

        ResultView.printWinners(cars.winners());
    }
}