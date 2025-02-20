package de.hbt.girlsday.calculator.ExtraAufgabe;

public class Prime {

    /*
     * Diese Methode soll überprüfen, ob eine gegebene Zahl eine Primzahl ist.
     * Ist es eine Primzahl, so soll der Wert true zurückgegeben werden.
     * Ist es keine Primzahl, so soll der Wert false zurückgegeben werden.
     * Eine Zahl ist dann eine Primzahl, wenn sie nur durch sich selbst und durch 1 ganzzahlig teilbar ist.
     * Schreibe auch einen Test dazu, welcher verschiedene Prim und nicht Primzahlen benutzt.
     *
     */
    public static boolean isPrime(final int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

}
