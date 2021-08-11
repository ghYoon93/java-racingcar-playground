package domain;

import java.util.Random;

public class Car {

    private final String name;
    private int position;

    public Car(String name) {
        this.name = name.trim();
    }

    public void move(MovingStrategy movingStrategy) {
        if (movingStrategy.movable()) {
            position++;
        }
    }

    public int getPosition() {
        return position;
    }
}
