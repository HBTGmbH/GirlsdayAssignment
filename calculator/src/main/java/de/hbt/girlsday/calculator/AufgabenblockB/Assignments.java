package de.hbt.girlsday.calculator.AufgabenblockB;

import de.hbt.girlsday.calculator.AufgabenblockA.Calculator;
import de.hbt.girlsday.calculator.AufgabenblockA.DivisionByZeroIsNotAllowed;

public class Assignments {

    /*
     * EINLEITUNG:
     * Hier wollen wir jetzt kleine Textaufgaben lösen. Dazu können wir die gerade erstellten Methoden verwenden.
     * Über jeder Methode steht eine Beschreibung der Aufgabe und die Tests sind bereits gefüllt.
     * Die Aufgabe ist es, die Methode zu füllen und damit alle Tests zu erfüllen (grüne Anzeige).
     *
     * Es stehen fast immer genaue Angaben im Text. Die Eingaben sind jeweils vordefiniert.
     * Wenn es zu einer Angabe in der Aufgabe keine definierte Eingabe gibt, sollen die Zahlen direkt in die Methode geschrieben werden.
     *
     * Hinweis:
     * Es gibt Hilfsmethoden, die hier benutzt werden können oder müssen. Eine Beschreibung zu den
     * verwendbaren Methoden findet ihr in der Datei "HelperMethods".
     */


    /*
     * Die 453 Kinder und 32 Lehrerinnen und Lehrer einer Grundschule fahren am Wandertag
     * mit Bussen in einen Freizeitpark. Jeder Bus hat 50 Sitzplätze.
     * Wie viele Busse müssen bestellt werden, damit alle einen Sitzplatz bekommen?
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
     * Eine Tüte enthält immer 15 Schokoladenbonbons. Alle deine 18 Mitschüler*innen sollen gleich viele Bonbons
     * bekommen und so viele wie möglich. Sind alle versorgt, darfst du den Rest essen.
     * Wie viele Bonbons bekommt jeder Schüler, wie viele Bonbons sind für dich übrig?
     *
     * Hinweis: hier wurde eine Klasse als Rückgabe definiert, damit mehr als eine Zahl ausgegeben werden kann.
     *          Tragt die zwei Lösungen an der richtigen Stelle ein.
     *
     * Beispiel:
     * Mit den 5 Tüten hast du insgesamt 75 Schokoladenbonbons. Das bedeutet alle 18 Mitschüler*innen bekommen 4 Bonbons.
     * Dann sind 72 Bonbons verteilt und du bekommst die restlichen 3 Bonbons.
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
        if (candyBags == 0) {
            return new CandyResult(0, 0);
        }
        var candyPerKid = Math.floor(allCandy / classmates);
        var leftOverCandy = Calculator.sub(allCandy, Calculator.multiply(candyPerKid, classmates));
        return new CandyResult(candyPerKid, leftOverCandy);
    }
}
