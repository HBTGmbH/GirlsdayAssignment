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
    assertThat(Calculator.divide(10d, 5d)).isEqualTo(2d);
  }

  @Test
  void divide3() throws DivisionByZeroIsNotAllowed {
    assertThat(Calculator.divide(1d, 2d)).isEqualTo(0.5d);
  }

  /*
   * Das hier ist eine Besonderheit. Bei der Division gibt es eine Ausnahme, es kann nicht durch null geteilt werden.
   * Hier soll eine Exception geworfen werden. Diese sagt dem Anwender, dass das die Eingabe nicht erlaubt ist.
   */
  @Test
  void dividedByZero() {
    assertThatExceptionOfType(DivisionByZeroIsNotAllowed.class).isThrownBy(() -> Calculator.divide(4d, 0d));
  }


}
