package racingcar;

public class Car {
    private final String name;
    private int position = 0;

    public Car(String name) {
        NameCheck.checkName(name); // 이름 검증
        this.name = name;
    }

    public void move(boolean canMove) {
        if (canMove) {
            position++;
        }
    }

    public String getName() {
        return name;
    }

    public int getPosition() {
        return position;
    }
}