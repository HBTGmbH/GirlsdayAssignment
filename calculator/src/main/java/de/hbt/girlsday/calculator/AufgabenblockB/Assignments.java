package de.hbt.girlsday.calculator.AufgabenblockB;

import de.hbt.girlsday.calculator.AufgabenblockA.Calculator;

public class Assignments {

    /*
     * Hier wollen wir jetzt kleine Aufgaben lösen.
     * Über der Methode steht immer eine Beschreibung der Aufgabe und die Tests sind wie immer bereits gefüllt.
     * Ziel ist es, alle Tests zu erfüllen (grüne Anzeige).
     *
     * Es stehen fast immer genaue Angaben im Text, die Eingabeparameter sind aber jeweils vordefiniert.
     * Wenn es zu einer Angabe keinen Parameter gibt, soll es direkt in die Lösung geschrieben werden.
     * Für eine Zwischenlösung ist es natürlich immer in Ordnung die angegebenen Zahlen zu verwenden.
     *
     * ACHTUNG:
     * Es gibt Hilfsmethoden, die hier benötigt werden. Genauer die Java Klasse "Math". Eine Beschreibung zu vielen
     * verwendbaren Methoden aus dieser Klasse findet ihr in der Datei "HelperMethods".
     */


    /*
     * Die 453 Kinder und 32 Lehrerinnen und Lehrer einer Grundschule fahren am Wandertag
     * mit Bussen in einen Freizeitpark. Jeder Bus hat 50 Sitzplätze.
     * Wie viele Busse müssen bestellt werden?
     */
    static double busPlanning(final double children, final double teacher, final double seatsPerBus) {
        var allPeople = Calculator.add(children, teacher);
        var busses = Calculator.divideCatch(allPeople, seatsPerBus);
        if (busses.isEmpty()) {
            return 0;
        }
        return Math.ceil(busses.get());
    }

    /*
     * Du nimmst anlässlich deines Geburtstags 5 Tüten Schokoladenbonbons mit in deine Klasse.
     * Eine Tüte enthält immer 15 Schokoladenbonbons. Alle 18 Kinder (ohne dich) sollen gleich viele Bonbons
     * bekommen. Der Rest ist für dich gedacht. Wie viele Bonbons bekommt jeder Schüler,
     * wie viele Bonbons sind für dich übrig?
     *
     * Hinweis: hier wurde eine Klasse als Rückgabe definiert, tragt einfach die zwei Lösungen an die richtige Stelle ein.
     */
    static CandyResult candyForKids(final double classmates, final double candyBags) {
        if (classmates == 0) {
            return new CandyResult(0d, 0d);
        }
        var allCandy = Calculator.multiply(candyBags, 15);
        var candyPerKid = Math.floor(allCandy / classmates);
        var leftOverCandy = Calculator.sub(allCandy, Calculator.multiply(candyPerKid, classmates));
        return new CandyResult(leftOverCandy, candyPerKid);
    }
}
