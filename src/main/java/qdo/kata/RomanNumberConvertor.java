package qdo.kata;

import java.util.Locale;
import java.util.regex.Pattern;

public class RomanNumberConvertor {

	private static final Pattern INVALID_CHARACTERS = Pattern.compile("^[IVXLCDM]+$");
	public static final String SPACE = "\s";
	public static final String EMPTY = "";

	public static int convert(String romanNumber) {
		String formattedRomanNumber = romanNumber.replaceAll(SPACE, EMPTY).toUpperCase(Locale.ENGLISH);
		isNumberValid(formattedRomanNumber);

		return 0;
	}

	private static void isNumberValid(String romanNumber){
		if(!INVALID_CHARACTERS.matcher(romanNumber).matches())
			throw new NumberFormatException("Bad character found");
	}
}
