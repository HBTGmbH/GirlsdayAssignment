package de.hbt.girlsday.calculator.AufgabenblockB;

public class HelperMethods {
    /*
     * Es gibt in Java viele Bibliotheken, die Funktionen bereitstellen, damit wir sie nicht selbst programmieren müssen.
     * So gibt es unter anderem die Math Bibliothek, die viele mathematische Funktionen beinhaltet
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
        // welche Zahl größer ist
        return Math.max(a,b);
    }
    static double min(double a, double b) {
        // oder kleiner
        return Math.min(a,b);
    }
    static double signum(double number) {
        // ob die Zahl negativ oder positiv ist
        return Math.signum(number);
    }
    static double power(double a, double b) {
        // a hoch b
        return Math.pow(a, b);
    }

    static double random() {
        // eine wahllose Zahl (zwischen 0 und 1)
        return Math.random();
    }
}
