package de.hbt.girlsday.calculator.AufgabenblockA;

public class Calculator {

    /*
     * Methode für Addition
     * factor1 soll mit factor2 addiert werden
     * die Rückgabe ist die Summe der Rechnung
     *
     * Beispiel:
     * Wenn factor1 gleich 6 ist und factor2 gleich 3 ist,
     * dann soll als Ergebnis 9 zurückgegeben werden
     */
    public static double add(final double factor1, final double factor2) {
        return 0;
    }

    /*
     * Methode für Subtraktion
     * factor1 soll minus factor2 gerechnet werden
     * die Rückgabe ist die Differenz der Rechnung
     *
     * Beispiel:
     * Wenn factor1 gleich 6 ist und factor2 gleich 3 ist,
     * dann soll als Ergebnis 3 zurückgegeben werden
     */
    public static double sub(final double factor1, final double factor2) {
        return 0;
    }

    /*
     * Methode für Multiplikation
     * factor1 soll mit factor2 multipliziert werden
     * die Rückgabe ist das Produkt der Rechnung
     *
     * Beispiel:
     * Wenn factor1 gleich 6 ist und factor2 gleich 3 ist,
     * dann soll als Ergebnis 18 zurückgegeben werden
     */
    public static double multiply(final double factor1, final double factor2) {
        return 0;
    }

    /*
     * Methode für Division
     * factor1 soll durch factor2 geteilt werden
     * die Rückgabe ist der Quotient der Rechnung
     * Achtung: In der Division gibt es eine Ausnahme. Durch 0 darf nie geteilt werden.
     *          Dieser Fall muss also abgefangen werden und es wird ein Fehler ausgegeben.
     *          Statt eines Rückgabewerts muss hier dann diese Zeile stehen. "throw new DivisionByZeroIsNotAllowed();"
     *
     * Beispiel:
     * Wenn factor1 gleich 6 ist und factor2 gleich 3 ist,
     * dann soll als Ergebnis 2 zurückgegeben werden
     */
    public static double divide(final double factor1, final double factor2) throws DivisionByZeroIsNotAllowed {
        throw new DivisionByZeroIsNotAllowed();
    }

}
