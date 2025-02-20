package de.hbt.girlsday.calculator.AufgabenblockA;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MultiplicationTest {

  @Test
  void multiply1() {
    assertThat(Calculator.multiply(0d, 0d)).isEqualTo(0d);
  }

  @Test
  void multiply2() {
    assertThat(Calculator.multiply(1d, 2d)).isEqualTo(2d);
  }

  @Test
  void multiply3() {
    assertThat(Calculator.multiply(1.5d, 2.5d)).isEqualTo(3.75d);
  }


}
