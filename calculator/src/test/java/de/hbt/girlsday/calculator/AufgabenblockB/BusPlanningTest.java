package de.hbt.girlsday.calculator.AufgabenblockB;

import org.junit.jupiter.api.Test;

import static de.hbt.girlsday.calculator.AufgabenblockB.Assignments.busPlanning;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

public class BusPlanningTest {

    @Test
    void busPlanning1() {
        assertThat(busPlanning(453, 23, 50)).isEqualTo(10);
    }

    @Test
    void busPlanning2() {
        assertThat(busPlanning(425, 25, 50)).isEqualTo(9);
    }

    @Test
    void busPlanning3() {
        assertThat(busPlanning(40, 10, 10)).isEqualTo(5);
    }

    @Test
    void busPlanning4() {
        assertDoesNotThrow(() -> busPlanning(40, 10, 0));
    }
}
