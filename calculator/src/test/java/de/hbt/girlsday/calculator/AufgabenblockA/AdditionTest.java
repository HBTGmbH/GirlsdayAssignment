package de.hbt.girlsday.calculator.AufgabenblockA;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class AdditionTest {

  /*
   * Das hier ist ein Test. Mit diesen arbeiten Programmierer*innen täglich und prüfen damit ihren Code.
   *
   * Die Struktur ist gegeben durch given, when und then.
   * In given definieren wir die Eingabe Werte sowie das erwartete Ergebnis des Methodenaufrufs.
   * In when wird der Aufruf ausgeführt und einer Variable zugewiesen, die dann das Ergebnis erhält.
   * In then wird das erwartete Ergebnis mit dem tatsächlichen Ergebnis verglichen.
   */
  @Test
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
   * In der Realität wird man bei einfachen Methoden, wie dieser Addition häufig eine kurze Variante sehen.
   * Der Inhalt des Tests bleibt aber gleich.
   */
  @Test
  void add1_short() {
    assertThat(Calculator.add(1d, 2d)).isEqualTo(3d);
  }


  @Test
  void add2() {
    assertThat(Calculator.add(6d, 3d)).isEqualTo(9d);
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
