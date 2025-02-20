package de.hbt.girlsday.calculator.AufgabenblockB;

public class AssignmentsUsingLoops {

    /*
     * Hier wollen wir jetzt kleine Aufgaben mithilfe von Schleifen lösen.
     *
     * Voraussetzungen wieder wie bei den anderen Aufgaben (hier nochmal kopiert).
     * Über der Methode steht immer eine Beschreibung der Aufgabe und die Tests sind wie immer bereits gefüllt.
     * Ziel ist es, alle Tests zu erfüllen (grüne Anzeige).
     *
     * Es stehen fast immer genaue Angaben im Text, die Eingabeparameter sind aber jeweils vordefiniert.
     * Wenn es zu einer Angabe keinen Parameter gibt, soll es direkt in die Lösung geschrieben werden.
     * Für eine Zwischenlösung ist es natürlich immer in Ordnung die angegebenen Zahlen zu verwenden.
     *
     */

    /*
     * Du bekommst eine Anzahl an gleichen Aufgaben gestellt und sollst alle erledigen.
     * Die erste kannst du in 2 Tagen (48 Stunden) erledigen.
     * Da du Anfänger bist, hast du eine Lernkurve und brauchst für jede weitere Aufgabe eine Stunde weniger als für die davor.
     * Der Mindestaufwand für die Aufgabe ist 3 Stunden. Sobald du also 3 Stunden für die Aufgabe brauchst, wirst du nicht mehr schneller.
     * Wie viele Stunden brauchst du, um die eingegebene Anzahl an Aufgaben zu erledigen?
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
     * Hier ist noch einmal die gleiche Aufgabe wie vorher beschrieben.
     * Es gibt aber andere (mehr) Eingabeparameter. Das führt zu ein paar Ausnahmen, die ihr anders behandeln müsst.
     *
     * Hinweis: Kopiert die Lösung von oben und tauscht die Variablen nach und nach aus! Schaut dann was noch verändert werden muss.
     */
    static int howManyHours(final int numberOfTasks, final int initialHoursForOneTask, final int minimalHoursForOneTask, final int improvementHoursPerTask) {
        var hoursForOneTask = Math.max(initialHoursForOneTask, minimalHoursForOneTask);
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
