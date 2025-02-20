package de.hbt.girlsday.calculator.AufgabenblockA;

import java.util.Optional;

public class Calculator {

    /*
     * Methode für Addition
     * factor1 soll mit factor2 addiert werden
     * die Rückgabe ist die Summe der Rechnung
     */
    public static double add(final double factor1, final double factor2) {
        return factor1 + factor2;
    }

    /*
     * Methode für Subtraktion
     * factor1 soll minus factor2 gerechnet werden
     * die Rückgabe ist die Differenz der Rechnung
     */
    public static double sub(final double factor1, final double factor2) {
        return factor1 - factor2;
    }

    /*
     * Methode für Multiplikation
     * factor1 soll mit factor2 multipliziert werden
     * die Rückgabe ist das Produkt der Rechnung
     */
    public static double multiply(final double factor1, final double factor2) {
        return factor1 * factor2;
    }

    /*
     * Methode für Division
     * factor1 soll durch factor2 geteilt werden
     * die Rückgabe ist der Quotient der Rechnung
     *
     * Hinweis: um einen bestimmten Fehler auszugeben wird dieser mithilfe von throw "geworfen"
     */
    public static double divide(final double factor1, final double factor2) throws DivisionByZeroIsNotAllowed {
        if (factor2 == 0d) {
            throw new DivisionByZeroIsNotAllowed();
        }
        return factor1 / factor2;
    }

    /*
     * Zweite Methode für Division
     * In der ersten Methode tritt bei Division durch 0 ein Fehler auf. Damit kann das Programm nicht immer umgehen.
     * Hier wollen wir die bereits definierte Methode aufrufen und den Fehler lösen. Dazu benutzen wir ein try.
     * Was in try drin steht, wird gemacht. Wenn der erwartete Fehler dadurch produziert wird, dann das "gefangen" werden.
     * Dazu wird das catch definiert. Hier kann man sagen, was im Fehlerfall passieren soll.
     * Die Rückgabe ist der Quotient, aus der anderen Methode ODER ein Optional.empty() also ein leeres Objekt in Java
     */
    public static Optional<Double> divideCatch(final double factor1, final double factor2) {
        try {
            return Optional.of(divide(factor1, factor2));
        } catch (DivisionByZeroIsNotAllowed e) {
            return Optional.empty();
        }
    }

}
