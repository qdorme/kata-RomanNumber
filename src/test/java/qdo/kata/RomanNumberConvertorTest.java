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
	public void shouldReturnTheConvertedValue(){
		assertThat(RomanNumberConvertor.convert("XIV")).isEqualTo(14);
		assertThat(RomanNumberConvertor.convert("LXXXIX")).isEqualTo(89);
		assertThat(RomanNumberConvertor.convert("MMMMDCCCLXXXVIII")).isEqualTo(4888);
	}

	@Test
	public void shouldThrowsNumberFormatExceptionIfFourTimesRepeated(){
		assertThatExceptionOfType(NumberFormatException.class).isThrownBy(() -> RomanNumberConvertor.convert("IIII"));
		assertThatExceptionOfType(NumberFormatException.class).isThrownBy(() -> RomanNumberConvertor.convert("VV"));
		assertThatExceptionOfType(NumberFormatException.class).isThrownBy(() -> RomanNumberConvertor.convert("XXXX"));
		assertThatExceptionOfType(NumberFormatException.class).isThrownBy(() -> RomanNumberConvertor.convert("LL"));
		assertThatExceptionOfType(NumberFormatException.class).isThrownBy(() -> RomanNumberConvertor.convert("CCCC"));
		assertThatExceptionOfType(NumberFormatException.class).isThrownBy(() -> RomanNumberConvertor.convert("DD"));
	}
}
