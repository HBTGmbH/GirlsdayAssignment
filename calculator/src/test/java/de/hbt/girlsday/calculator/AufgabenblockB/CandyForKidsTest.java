package de.hbt.girlsday.calculator.AufgabenblockB;

import org.junit.jupiter.api.Test;

import static de.hbt.girlsday.calculator.AufgabenblockB.Assignments.candyForKids;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

public class CandyForKidsTest {

    @Test
    void candyForKids1() {
        assertThat(candyForKids(18, 5)).isEqualTo(new CandyResult(3, 4));
    }

    @Test
    void candyForKids2() {
        assertThat(candyForKids(20, 3)).isEqualTo(new CandyResult(5, 2));
    }

    @Test
    void candyForKids3() {
        assertDoesNotThrow(() -> candyForKids(0, 2));
    }
}
