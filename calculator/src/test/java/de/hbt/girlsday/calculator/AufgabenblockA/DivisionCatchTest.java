package de.hbt.girlsday.calculator.AufgabenblockA;

import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

public class DivisionCatchTest {

    @Test
    void divide1() {
        assertThat(Calculator.divideCatch(10d, 5d)).isEqualTo(Optional.of(2d));
    }

    @Test
    void divide2() {
        assertDoesNotThrow(() -> Calculator.divideCatch(15d, 0d));
        assertThat(Calculator.divideCatch(15d, 0d)).isEqualTo(Optional.empty());
    }

}
