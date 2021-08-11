package domain;

import java.util.Random;

public class RandomMovingStrategy implements MovingStrategy {

    public static final int MAX_BOUND = 10;
    public static final int FORWARD_NUMBER = 4;

    @Override
    public boolean movable() {
        return getRandomNo() >= FORWARD_NUMBER;
    }

    private int getRandomNo() {
        Random random = new Random();
        return random.nextInt(MAX_BOUND);
    }
}
