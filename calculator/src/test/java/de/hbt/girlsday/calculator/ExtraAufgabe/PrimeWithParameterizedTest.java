package de.hbt.girlsday.calculator.ExtraAufgabe;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;

class PrimeWithParameterizedTest {

    @ParameterizedTest
    @ValueSource(ints = {3, 5, 7, 11, 13, 17})
    void isPrime(final int number) {
        assertThat(Prime.isPrime(number)).isTrue();
    }

    @ParameterizedTest
    @ValueSource(ints = {4, 6, 8, 9, 10, 12, 15})
    void isNoPrime(final int number) {
        assertThat(Prime.isPrime(number)).isFalse();
    }

}