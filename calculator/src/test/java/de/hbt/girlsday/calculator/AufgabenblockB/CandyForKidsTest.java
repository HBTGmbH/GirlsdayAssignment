package de.hbt.girlsday.calculator.AufgabenblockB;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static de.hbt.girlsday.calculator.AufgabenblockB.Assignments.candyForKids;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

public class CandyForKidsTest {

    @Test
    @DisplayName("Test: alle Klassenkameraden bekommen genau ein Schokoladenbonbon")
    void candyForKids1() {
        assertThat(candyForKids(15, 1)).isEqualTo(new CandyResult(1, 0));
    }

    @Test
    @DisplayName("Test: Beispiel aus der Aufgabe")
    void candyForKids2() {
        assertThat(candyForKids(18, 5)).isEqualTo(new CandyResult(4, 3));
    }

    @Test
    @DisplayName("Test: 20 Klassenkameraden und 3 Tüten Schokoladenbonbons")
    void candyForKids3() {
        assertThat(candyForKids(20, 3)).isEqualTo(new CandyResult(2, 5));
    }

    @Test
    @DisplayName("Test: Ausnahme alle Klassenkameraden sind krank")
    void candyForKids4() {
        assertDoesNotThrow(() -> candyForKids(0, 2));
        assertThat(candyForKids(0, 2)).isEqualTo(new CandyResult(0, 30));
    }
}
