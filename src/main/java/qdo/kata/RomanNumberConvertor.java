package qdo.kata;

import java.util.Locale;
import java.util.regex.Pattern;
import java.util.stream.IntStream;

public class RomanNumberConvertor {

	private static final Pattern INVALID_CHARACTERS = Pattern.compile("^[IVXLCDM]+$");
	public static final String SPACE = "\s";
	public static final String EMPTY = "";

	public static int convert(String romanNumber) {
		String formattedRomanNumber = romanNumber.replaceAll(SPACE, EMPTY).toUpperCase(Locale.ENGLISH);
		isNumberValid(formattedRomanNumber);

		return IntStream.range(0, formattedRomanNumber.length())
				.map(index -> {
					Integer value = RomanNumberValue.valueOf(String.valueOf(formattedRomanNumber.charAt(index))).value();
					if (isNegativeNumber(formattedRomanNumber, index)) {
						value *= -1;
					}
					return value;
				})
				.sum();
	}

	private static boolean isNegativeNumber(String formattedRomanNumber, int index) {
		return isNotTheLastCharacter(formattedRomanNumber, index)
				&& theNextCharacterIsGreater(formattedRomanNumber, index);
	}

	private static boolean theNextCharacterIsGreater(String formattedRomanNumber, int index) {
		return RomanNumberValue.valueOf(String.valueOf(formattedRomanNumber.charAt(index))).compareTo(
			RomanNumberValue.valueOf(String.valueOf(formattedRomanNumber.charAt(index + 1)))) < 0;
	}

	private static boolean isNotTheLastCharacter(String formattedRomanNumber, int index) {
		return index < formattedRomanNumber.length() - 1;
	}

	private static void isNumberValid(String romanNumber){
		if(!INVALID_CHARACTERS.matcher(romanNumber).matches())
			throw new NumberFormatException("Bad character found");
	}
}
