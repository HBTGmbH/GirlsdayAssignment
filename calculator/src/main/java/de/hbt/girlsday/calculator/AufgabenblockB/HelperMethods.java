package de.hbt.girlsday.calculator.AufgabenblockB;

public class HelperMethods {
    /*
     * Es gibt in Java viele "Bibliotheken", die Methoden bereitstellen, damit wir sie nicht selbst schreiben müssen.
     * So gibt es unter anderem die Math Bibliothek, die viele mathematische Probleme löst.
     * Einige davon stellen wir hier vor.
     */
    static double round(double number) {
        // simples runden
        return Math.round(number);
    }
    static double floor(double number) {
        // abrunden
        return Math.floor(number);
    }
    static double ceil(double number) {
        // aufrunden
        return Math.ceil(number);
    }
    static double max(double a, double b) {
        // welche Zahl ist größer
        return Math.max(a,b);
    }
    static double min(double a, double b) {
        // welche Zahl ist kleiner
        return Math.min(a,b);
    }
    static double power(double a, double b) {
        // a hoch b
        return Math.pow(a, b);
    }
}
