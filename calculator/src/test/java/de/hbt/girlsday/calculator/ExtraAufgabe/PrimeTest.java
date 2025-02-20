package de.hbt.girlsday.calculator.ExtraAufgabe;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class PrimeTest {


    /*
     * Aufgabe 2:
     * Schreibe einen eigenen Test zu deiner Lösung. Dies kannst du in der Datei PrimeTest.java hinzufügen.
     * Dieser sollte verschiedene Primzahlen und nicht Primzahlen testen.
     */
    @Test
    @DisplayName("Hier ist Platz für deinen eigenen Test aus Aufgabe 2.")
    void toBeFilled() {

    }


    /*
     * Tests für die Erfüllung von Aufgabe 1
     */

    @Test
    @DisplayName("Eingabe ist 5 -> 5 ist eine Primzahl")
    void fiveIsPrime() {
        assertThat(Prime.isPrime(5)).isTrue();
    }

    @Test
    @DisplayName("Eingabe ist 6 -> 6 ist keine Primzahl")
    void sixIsNotPrime() {
        assertThat(Prime.isPrime(6)).isFalse();
    }

    /*
     * Zusatzaufgabe 1:
     * Es gibt noch viele weitere Zahlen, die Primzahlen sein könnten.
     * Wie sieht es zum Beispiel bei der 2, der 7, der 79 oder 119 aus?
     * Kopiere die Tests und passe sie so an, dass sie diese Fälle betrachten.
     */

    /*
     * Zusatzaufgabe 2:
     * Was passiert bei deiner Methode, wenn die Eingabe 0, 1 oder eine negative Zahl wie -5 ist?
     * Primzahlen können nur positiv sein. Außerdem müssen sie größer als 1 sein.
     * Schreibe auch für diese Fälle Tests und passe deine Lösung gegebenenfalls an,
     * falls diese Tests zunächst fehlschlagen.
     */
}