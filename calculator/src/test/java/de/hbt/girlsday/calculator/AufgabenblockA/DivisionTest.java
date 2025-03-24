package de.hbt.girlsday.calculator.AufgabenblockA;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;

class DivisionTest {

  @Test
  void divide1() throws DivisionByZeroIsNotAllowed {
    assertThat(Calculator.divide(0d, 1d)).isEqualTo(0d);
  }

  @Test
  void divide2() throws DivisionByZeroIsNotAllowed {
    assertThat(Calculator.divide(6d,3d)).isEqualTo(2d);
  }

  @Test
  void divide3() throws DivisionByZeroIsNotAllowed {
    assertThat(Calculator.divide(1d, 2d)).isEqualTo(0.5d);
  }

  /*
   * Das hier ist eine Besonderheit. Bei der Division gibt es eine Ausnahme, es darf nicht durch null geteilt werden.
   * Hier soll ein Fehler (engl. Exception) geworfen werden. Diese sagt dem Anwendenden, dass das die Eingabe nicht erlaubt ist.
   */
  @Test
  void dividedByZero() {
    assertThatExceptionOfType(DivisionByZeroIsNotAllowed.class).isThrownBy(() -> Calculator.divide(4d, 0d));
  }


}
