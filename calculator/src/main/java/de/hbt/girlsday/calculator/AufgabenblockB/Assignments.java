package de.hbt.girlsday.calculator.AufgabenblockB;

import de.hbt.girlsday.calculator.AufgabenblockA.Calculator;
import de.hbt.girlsday.calculator.AufgabenblockA.DivisionByZeroIsNotAllowed;

public class Assignments {

    /*
     * EINLEITUNG:
     * Hier wollen wir jetzt kleine Aufgaben lösen.
     * Über der Methode steht immer eine Beschreibung der Aufgabe und die Tests sind wie immer bereits gefüllt.
     * Ziel ist es, alle Tests zu erfüllen (grüne Anzeige).
     *
     * Es stehen fast immer genaue Angaben im Text. Die Eingaben sind jeweils vordefiniert.
     * Wenn es zu einer Angabe in der Aufgabe keine definierte Eingabe gibt, sollen die Zahlen direkt in die Lösung geschrieben werden.
     *
     * ACHTUNG:
     * Es gibt Hilfsmethoden, die hier benutzt werden können. Eine Beschreibung zu den
     * verwendbaren Methoden findet ihr in der Datei "HelperMethods".
     */


    /*
     * Die 453 Kinder und 32 Lehrerinnen und Lehrer einer Grundschule fahren am Wandertag
     * mit Bussen in einen Freizeitpark. Jeder Bus hat 50 Sitzplätze.
     * Wie viele Busse müssen bestellt werden?
     *
     * Beispiel:
     * Bei insgesamt 485 Personen und 50 Sitzplätzen pro Bus, werden 10 Busse gebraucht.
     * 9 Busse sind dabei voll besetzt und im zehnten Bus sitzen 35 Personen
     */
    static double busPlanning(final double children, final double teacher, final double seatsPerBus) throws DivisionByZeroIsNotAllowed{
        var allPeople = Calculator.add(children, teacher);
        var busses = Calculator.divide(allPeople, seatsPerBus);
        return Math.ceil(busses);
    }

    /*
     * Du nimmst anlässlich deines Geburtstags 5 Tüten Schokoladenbonbons mit in deine Klasse.
     * Eine Tüte enthält immer 15 Schokoladenbonbons. Alle 18 Kinder (ohne dich) sollen gleich viele Bonbons
     * bekommen. Der Rest ist für dich gedacht. Wie viele Bonbons bekommt jeder Schüler,
     * wie viele Bonbons sind für dich übrig?
     *
     * Hinweis: hier wurde eine Klasse als Rückgabe definiert, tragt einfach die zwei Lösungen an die richtige Stelle ein.
     *
     * Beispiel:
     *
     */
    static CandyResult candyForKids(final double classmates, final double candyBags) {
        /* TODO Initialisierung:
         *  var candyPerKid = 0;
         *  var leftOverCandy = 0;
         *  return new CandyResult(leftOverCandy, candyPerKid);
         */
        var allCandy = Calculator.multiply(candyBags, 15);

        if (classmates == 0) {
            return new CandyResult(0d, allCandy);
        }
        var candyPerKid = Math.floor(allCandy / classmates);
        var leftOverCandy = Calculator.sub(allCandy, Calculator.multiply(candyPerKid, classmates));
        return new CandyResult(candyPerKid, leftOverCandy);
    }
}
