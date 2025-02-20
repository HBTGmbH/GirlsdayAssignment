package de.hbt.girlsday.calculator.AufgabenblockB;

import de.hbt.girlsday.calculator.AufgabenblockA.DivisionByZeroIsNotAllowed;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static de.hbt.girlsday.calculator.AufgabenblockB.Assignments.busPlanning;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class BusPlanningTest {

    @Test
    @DisplayName("Test: In 9 Bussen sind alle Plätze belegt")
    void busPlanning1() throws DivisionByZeroIsNotAllowed {
        assertThat(busPlanning(425, 25, 50)).isEqualTo(9);
    }

    @Test
    @DisplayName("Test: Beispiel aus der Aufgabe")
    void busPlanning2() throws DivisionByZeroIsNotAllowed {
        assertThat(busPlanning(453, 23, 50)).isEqualTo(10);
    }

    @Test
    @DisplayName("Test: Kleinere Busse")
    void busPlanning3() throws DivisionByZeroIsNotAllowed {
        assertThat(busPlanning(40, 10, 10)).isEqualTo(5);
    }

    @Test
    @DisplayName("Test: Ausnahme - die Busse haben keine Plätze")
    void busPlanning4() {
        assertThrows(DivisionByZeroIsNotAllowed.class, () -> busPlanning(40, 10, 0));
    }
}
