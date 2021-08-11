package domain;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class CarTests {
    @Test
    void 이동() {
        Car car = new Car("yghee");
        car.move(4);
        assertThat(car.getPosition()).isEqualTo(1);
    }

    @Test
    void 정지() {
        Car car = new Car("yghee");
        car.move(3);
        assertThat(car.getPosition()).isEqualTo(0);
    }
}