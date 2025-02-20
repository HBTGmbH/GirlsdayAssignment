package de.hbt.girlsday.calculator.ExtraAufgabe;

public class Prime {

    /*
     * Aufgabe 1:
     * Diese Methode soll überprüfen, ob eine gegebene Zahl eine Primzahl ist.
     * Ist es eine Primzahl, so soll der Wert true zurückgegeben werden.
     * Ist es keine Primzahl, so soll der Wert false zurückgegeben werden.
     * Eine Zahl ist dann eine Primzahl, wenn sie nur durch sich selbst und durch 1 ganzzahlig teilbar ist.
     *
     * Aufgabe 2:
     * Schreibe einen eigenen Test zu deiner Lösung. Dies kannst du in der Datei PrimeTest.java hinzufügen.
     * Dieser sollte verschiedene Primzahlen und nicht Primzahlen testen.
     *
     * Beispiel:
     * Ist die Eingabe 5, soll true zurückgegeben werden.
     * Die 5 ist eine Primzahl, da sie nicht durch 4, 3 oder 2 teilbar ist.
     *
     * Ist die Eingabe 6, soll false zurückgegeben werden.
     * Die 6 ist keine Primzahl, da sie durch 3 und 2 teilbar ist.
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
