package de.hbt.girlsday.calculator.AufgabenblockB;

import static de.hbt.girlsday.calculator.AufgabenblockB.HelperMethods.max;

public class AssignmentsUsingLoops {

    /*
     * EINLEITUNG:
     * Hier wollen wir jetzt kleine Aufgaben mithilfe von Schleifen lösen.
     *
     * Die Voraussetzungen sind wieder wie bei den anderen Aufgaben.
     * Über der Methode steht immer eine Beschreibung der Aufgabe und die Tests sind wie immer bereits geschrieben.
     * Ziel ist es, alle Tests zu erfüllen (grüne Anzeige).
     *
     * Es stehen fast immer genaue Angaben im Text. Die Eingaben sind jeweils vordefiniert.
     * Wenn es zu einer Angabe in der Aufgabe keine definierte Eingabe gibt, sollen die Zahlen direkt in die Lösung geschrieben werden.
     *
     */



    /*
     * AUFGABE 1:
     * Du bekommst eine Anzahl an gleichen Aufgaben gestellt und sollst alle erledigen.
     * Die erste kannst du in 2 Tagen (48 Stunden) erledigen.
     * Da du Anfänger bist, hast du eine Lernkurve und brauchst für jede weitere Aufgabe eine Stunde weniger als für die davor.
     * Der Mindestaufwand für die Aufgabe ist 3 Stunden. Sobald du also 3 Stunden für die Aufgabe brauchst, wirst du nicht mehr schneller.
     * Wie viele Stunden brauchst du, um die eingegebene Anzahl an Aufgaben zu erledigen?
     *
     * Beispiel:
     * Bei zwei Aufgaben brauchst du für die erste Aufgabe 48 Stunden und für die zweite Aufgabe 47 Stunden.
     * Als Ergebnis erwarten wir also 48 + 47 = 95 Stunden
     */
    static int howManyHours(final int numberOfTasks) {
        final var minimalHoursForOneTask = 3;
        var hoursForOneTask = 48;
        var effort = 0;
        for (int i = 1; i <= numberOfTasks; i++) {
            effort += hoursForOneTask;
            if (hoursForOneTask > minimalHoursForOneTask) {
                hoursForOneTask--;
            }
        }
        return effort;
    }

    /*
     * AUFGABE 2:
     * Hier ist noch einmal die gleiche Aufgabe wie vorher beschrieben.
     * Es gibt aber andere (mehr) Eingabeparameter. Das führt zu ein paar Ausnahmen, die ihr anders behandeln müsst.
     *
     * Hinweis: Kopiert die Lösung von oben und tauscht die Variablen nach und nach aus! Schaut dann was verändert werden muss.
     *
     * Beispiel:
     * Um die Aufgabe von oben nachzustellen wären es diese Eingaben
     * numberOfTasks = 2
     * initialHoursForOneTask = 48
     * minimalHoursForOneTask = 3
     * improvementHoursPerTask = 1
     *
     */
    static int howManyHours(final int numberOfTasks, final int initialHoursForOneTask, final int minimalHoursForOneTask, final int improvementHoursPerTask) {
        var hoursForOneTask = max(initialHoursForOneTask, minimalHoursForOneTask);
        var effort = 0;
        for (int i = 1; i <= numberOfTasks; i++) {
            effort += hoursForOneTask;
            if (hoursForOneTask - improvementHoursPerTask >= minimalHoursForOneTask) {
                hoursForOneTask -= improvementHoursPerTask;
            } else {
                hoursForOneTask = minimalHoursForOneTask;
            }
        }
        return effort;
    }
}
