package de.hbt.girlsday.calculator.AufgabenblockB;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static de.hbt.girlsday.calculator.AufgabenblockB.AssignmentsUsingLoops.howManyHours;
import static org.assertj.core.api.Assertions.assertThat;

public class HowManyHoursTest {
    /*
     * Tests für AUFGABE 1
     */
    @Nested
    @DisplayName("Aufgabe 1:")
    class HowManyHours {
        @Test
        @DisplayName("Test: zwei Aufgaben")
        void howManyHours1() {
            // bei zwei Aufgaben braucht man für die erste Aufgabe 48 Stunden und die zweite Aufgabe 47 Stunden
            // 48 + 47 = 95
            assertThat(howManyHours(2)).isEqualTo(95);
        }
        @Test
        @DisplayName("Test: Ausführung ohne den Mindestaufwand von 3 Stunden zu erreichen")
        void howManyHours2() {
            assertThat(howManyHours(45)).isEqualTo(1170);
        }

        @Test
        @DisplayName("Test: Ausführung mit Erreichung des Mindestaufwands von 3 Stunden")
        void howManyHours3() {
            assertThat(howManyHours(50)).isEqualTo(1185);
        }
    }


    /*
     * Tests für AUFGABE 2
     */
    @Nested
    @DisplayName("Aufgabe 2:")
    class HowManyHoursFree {
        @Test
        @DisplayName("Test: Beispiel der ersten Aufgabe nachgestellt")
        void howManyHoursFree() {
            assertThat(howManyHours(2, 48, 3, 1)).isEqualTo(95);
        }

        @Test
        @DisplayName("Test: Beispiel der ersten Aufgabe nachgestellt, minimale Stundenanzahl überschritten")
        void howManyHoursFree1() {
            assertThat(howManyHours(50, 48, 3, 1)).isEqualTo(1185);
        }

        @Test
        @DisplayName("Test: der Grundaufwand wurde verändert")
        void howManyHoursFree2() {
            assertThat(howManyHours(2, 6, 3, 1)).isEqualTo(11);
        }

        @Test
        @DisplayName("Test: der Minimalaufwand wurde verändert")
        void howManyHoursFree3() {
            assertThat(howManyHours(50, 48, 5, 1)).isEqualTo(1196);
        }

        @Test
        @DisplayName("Test: die Verbesserung pro Aufgabe wurde verändert")
        void howManyHoursFree4() {
            assertThat(howManyHours(2, 6, 3, 2)).isEqualTo(10);
        }

        @Test
        @DisplayName("Test: alle Eingaben wurden gleichzeitig verändert")
        void howManyHoursFree5() {
            assertThat(howManyHours(1, 1, 3, 2)).isEqualTo(3);
            assertThat(howManyHours(4, 6, 3, 2)).isEqualTo(16);
            assertThat(howManyHours(10, 16, 2, 5)).isEqualTo(47);
        }
    }
}
