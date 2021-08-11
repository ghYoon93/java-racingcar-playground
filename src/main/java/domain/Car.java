package domain;

import java.util.Random;

public class Car {


    public static final int MAX_BOUND = 10;
    private final String name;
    private int position;

    public Car(String name) {
        this.name = name.trim();
    }

    public void move(int randomNo) {
        if (randomNo >= 4) {
            position++;
        }
    }

    public void move() {
        if (getRandomNo() >= 4) {
            position++;
        }
    }

    public int getPosition() {
        return position;
    }

    protected int getRandomNo() {
        Random random = new Random();
        return random.nextInt(MAX_BOUND);
    }
}
