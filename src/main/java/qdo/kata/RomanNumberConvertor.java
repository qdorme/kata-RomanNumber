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
				.map(index -> RomanNumberValue.valueOf(String.valueOf(formattedRomanNumber.charAt(index))).value())
				.sum();
	}

	private static void isNumberValid(String romanNumber){
		if(!INVALID_CHARACTERS.matcher(romanNumber).matches())
			throw new NumberFormatException("Bad character found");
	}
}
