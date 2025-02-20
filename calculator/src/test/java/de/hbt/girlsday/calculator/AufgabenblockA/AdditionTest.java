package de.hbt.girlsday.calculator.AufgabenblockA;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class AdditionTest {

  /*
   * Das hier ist ein Test, wie wir ihn auch schreiben würden. Die Struktur ist gegeben durch given, when, then
   * in given definieren wir Eingabe Werte sowie das erwartete Ergebnis des Aufrufs
   * in when wird der Aufruf ausgeführt und einer Variable zugewiesen, die das echte Ergebnis des Aufrufs erhält,
   * in then ist der Hauptpart des Tests, hier wird die Erwartung mit dem echten Ergebnis verglichen
   */
  @Test
  @DisplayName("das stimmt weil das ")
  void add1() {
    // given
    double factor1 = 1d;
    double factor2 = 2d;

    double expectedSum = 3d;

    // when
    double result = Calculator.add(factor1, factor2);

    // then
    assertThat(result).isEqualTo(expectedSum);
  }

  /*
   * In der Realität wird man bei einfachen Methoden, wie dieser Addition häufig eine kurze Variante sehen
   * der Inhalt des Tests bleibt aber gleich zum Ersten
   */
  @Test
  void add2() {
    assertThat(Calculator.add(1d, 2d)).isEqualTo(3d);
  }

  @Test
  void add3() {
    assertThat(Calculator.add(0d, 0d)).isEqualTo(0d);
  }

  @Test
  void add4() {
    assertThat(Calculator.add(1.5d, 2.5d)).isEqualTo(4d);
  }

}
