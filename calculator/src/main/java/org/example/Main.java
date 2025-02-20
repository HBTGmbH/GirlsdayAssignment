package org.example;

import de.hbt.girlsday.calculator.AufgabenblockA.Calculator;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        // Variablen Deklaration (Typ Kommazahl)
        double tmp = 10.0;
        // Variablen Deklaration (beliebiger Typ)
        var zero = 0.0;

        // Variable neu belegen mit dem Ergebnis aus aufgerufener Methode
        tmp = giveBackInput(9d);
        // Methode aus anderer Klasse aufrufen
        tmp = Calculator.add(tmp, zero);

        // Bedingungen - if
        if (tmp != zero) {
            // Konsolenausgabe
            System.out.println("Die Variable ist nicht null!");
        } else {
            System.out.println("Die Variable ist gleich null!");
        }

        // Schleifen
        // while (Bedingung)
        while (tmp != 0) {
            tmp = tmp - 1;
        }
        // for (Startwert ; Bedingung ; Veränderung)
        for (int i = 0; i <= 2; i = i + 1) {
            tmp = tmp + i;
        }

        if (tmp < 0) {
            // bekannten Fehler ausgeben
            throw new RuntimeException("Diese Variable darf nicht kleiner als 0 werden!");
        }
    }

    // Methode
    private static double giveBackInput(double number) {
        // Rückgabe definieren
        return number;
    }
}
