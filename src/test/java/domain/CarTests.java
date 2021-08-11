package domain;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CarTests {
    @Test
    void 이동() {
        Car car = new Car("yghee");
        car.move(() -> true);
        assertThat(car.getPosition()).isEqualTo(1);
    }

    @Test
    void 정지() {
        Car car = new Car("yghee");
        car.move(() -> false);
        assertThat(car.getPosition()).isEqualTo(0);
    }
}