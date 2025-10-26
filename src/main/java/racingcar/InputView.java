package racingcar;

import camp.nextstep.edu.missionutils.Console;
import java.util.Arrays;
import java.util.List;

public class InputView {

    public static List<String> readCarNames() {
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        String line = Console.readLine(); // 우테코 요구사항  , 정해진 라이브러리로 받기

        List<String> names = Arrays.stream(line.split(","))
                .map(String::trim)
                .toList();

        if (names.isEmpty()) {
            throw new IllegalArgumentException("자동차 이름이 비어있습니다."); // 문자열이 비어았으면 예외처리 하기.
        }

        return names; // 문자 배열 리턴
    }

    public static int readTryCount() {
        System.out.println("시도할 횟수를 입력해주세요: ");
        String raw = Console.readLine();

        int count;
        try {
            count = Integer.parseInt(raw.trim());
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("시도 횟수는 숫자만 가능합니다."); // 숫자가 아닌경우 예외처리 하기.
        }

        if (count <= 0) {
            throw new IllegalArgumentException("시도 횟수는 1 이상의 자연수만 가능합니다.");
        }

        return count;
    }
}