package de.hbt.girlsday.calculator.AufgabenblockA;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SubtractionTest {


  @Test
  void subtract1() {
    assertThat(Calculator.sub(0d, 0d)).isEqualTo(0d);
  }

  @Test
  void subtract2() {
    assertThat(Calculator.sub(2d, 1d)).isEqualTo(1d);
  }

  @Test
  void subtract3() {
    assertThat(Calculator.sub(2.5d, 1.5d)).isEqualTo(1d);
  }

  @Test
  void subtract4() {
    assertThat(Calculator.sub(2.5d, 3d)).isEqualTo(-0.5d);
  }

}
