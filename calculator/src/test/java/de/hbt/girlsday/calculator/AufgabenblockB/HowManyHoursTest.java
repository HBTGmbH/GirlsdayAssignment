package de.hbt.girlsday.calculator.AufgabenblockB;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static de.hbt.girlsday.calculator.AufgabenblockB.AssignmentsUsingLoops.howManyHours;
import static org.assertj.core.api.Assertions.assertThat;

public class HowManyHoursTest {
    /*
     * Tests für die erste Version der Aufgabe
     */
    @Nested
    class HowManyHours {
        @Test
        void howManyHours1() {
            assertThat(howManyHours(2)).isEqualTo(95);
        }
        @Test
        void howManyHours2() {
            assertThat(howManyHours(50)).isEqualTo(1185);
        }
    }


    /*
     * Tests für die zweite Version der Aufgabe
     *
     * mit freien Variablen wird die Implementierung nicht viel schwerer
     * es müssen allerdings Ausnahmen betrachtet werden, damit die Funktion immer richtig funktioniert
     */
    @Nested
    class HowManyHoursFree {
        @Test
        void howManyHoursFree1() {
            assertThat(howManyHours(50, 48, 3, 1)).isEqualTo(1185);
        }

        @Test
        void howManyHoursFree2() {
            assertThat(howManyHours(4, 6, 3, 2)).isEqualTo(16);
        }

        @Test
        void howManyHoursFree3() {
            assertThat(howManyHours(1, 1, 3, 2)).isEqualTo(3);
        }
    }
}
