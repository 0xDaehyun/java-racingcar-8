package racingcar;

import camp.nextstep.edu.missionutils.Randoms;

public class RandomMovePolicy implements MovePolicy {

    @Override
    public boolean canMove() {
        int number = Randoms.pickNumberInRange(0, 9);
        return number >= 4;
    }
}