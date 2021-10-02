package qdo.kata;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;

class RomanNumberConvertorTest {

	@Test
	public void shouldThrowsNumberFormatException(){
		assertThatExceptionOfType(NumberFormatException.class).isThrownBy(() -> RomanNumberConvertor.convert("A"));
		assertThatExceptionOfType(NumberFormatException.class).isThrownBy(() -> RomanNumberConvertor.convert("B"));
		assertThatExceptionOfType(NumberFormatException.class).isThrownBy(() -> RomanNumberConvertor.convert("E"));
		assertThatExceptionOfType(NumberFormatException.class).isThrownBy(() -> RomanNumberConvertor.convert("F"));
		assertThatExceptionOfType(NumberFormatException.class).isThrownBy(() -> RomanNumberConvertor.convert("G"));
		assertThatExceptionOfType(NumberFormatException.class).isThrownBy(() -> RomanNumberConvertor.convert("H"));
		assertThatExceptionOfType(NumberFormatException.class).isThrownBy(() -> RomanNumberConvertor.convert("J"));
		assertThatExceptionOfType(NumberFormatException.class).isThrownBy(() -> RomanNumberConvertor.convert("K"));
		assertThatExceptionOfType(NumberFormatException.class).isThrownBy(() -> RomanNumberConvertor.convert("N"));
		assertThatExceptionOfType(NumberFormatException.class).isThrownBy(() -> RomanNumberConvertor.convert("O"));
		assertThatExceptionOfType(NumberFormatException.class).isThrownBy(() -> RomanNumberConvertor.convert("P"));
		assertThatExceptionOfType(NumberFormatException.class).isThrownBy(() -> RomanNumberConvertor.convert("Q"));
		assertThatExceptionOfType(NumberFormatException.class).isThrownBy(() -> RomanNumberConvertor.convert("R"));
		assertThatExceptionOfType(NumberFormatException.class).isThrownBy(() -> RomanNumberConvertor.convert("S"));
		assertThatExceptionOfType(NumberFormatException.class).isThrownBy(() -> RomanNumberConvertor.convert("T"));
		assertThatExceptionOfType(NumberFormatException.class).isThrownBy(() -> RomanNumberConvertor.convert("U"));
		assertThatExceptionOfType(NumberFormatException.class).isThrownBy(() -> RomanNumberConvertor.convert("W"));
		assertThatExceptionOfType(NumberFormatException.class).isThrownBy(() -> RomanNumberConvertor.convert("Y"));
		assertThatExceptionOfType(NumberFormatException.class).isThrownBy(() -> RomanNumberConvertor.convert("Z"));
	}

	@Test
	public void shouldReturnSimplestValues(){
		assertThat(RomanNumberConvertor.convert("I")).isEqualTo(1);
		assertThat(RomanNumberConvertor.convert("V")).isEqualTo(5);
		assertThat(RomanNumberConvertor.convert("X")).isEqualTo(10);
		assertThat(RomanNumberConvertor.convert("L")).isEqualTo(50);
		assertThat(RomanNumberConvertor.convert("C")).isEqualTo(100);
		assertThat(RomanNumberConvertor.convert("D")).isEqualTo(500);
		assertThat(RomanNumberConvertor.convert("M")).isEqualTo(1000);
	}
}
