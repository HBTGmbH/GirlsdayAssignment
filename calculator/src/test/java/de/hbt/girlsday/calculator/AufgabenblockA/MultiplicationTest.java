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
    assertThat(Calculator.multiply(6d, 3d)).isEqualTo(18d);
  }

  @Test
  void multiply3() {
    assertThat(Calculator.multiply(1.5d, 2.5d)).isEqualTo(3.75d);
  }


}
