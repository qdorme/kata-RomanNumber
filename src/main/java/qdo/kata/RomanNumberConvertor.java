package qdo.kata;

import java.util.Locale;
import java.util.regex.Pattern;
import java.util.stream.IntStream;

public class RomanNumberConvertor {

	private static final Pattern INVALID_CHARACTERS = Pattern.compile("^[IVXLCDM]+$");
	private static final Pattern INVALID_IIII = Pattern.compile("I{4}");
	private static final Pattern INVALID_VV = Pattern.compile("V{2}");
	private static final Pattern INVALID_XXXX = Pattern.compile("X{4}");
	private static final Pattern INVALID_LL = Pattern.compile("L{2}");
	private static final Pattern INVALID_CCCC = Pattern.compile("C{4}");
	private static final Pattern INVALID_DD = Pattern.compile("D{2}");
	public static final String SPACE = "\s";
	public static final String EMPTY = "";

	public static int convert(String romanNumber) {
		String formattedRomanNumber = romanNumber.replaceAll(SPACE, EMPTY).toUpperCase(Locale.ENGLISH);
		isNumberValid(formattedRomanNumber);

		return IntStream.range(0, formattedRomanNumber.length())
				.map(index -> {
					int value = RomanNumberValue.valueOf(String.valueOf(formattedRomanNumber.charAt(index))).value();
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
		if(!INVALID_CHARACTERS.matcher(romanNumber).matches()
			|| INVALID_IIII.matcher(romanNumber).matches()
			|| INVALID_VV.matcher(romanNumber).matches()
			|| INVALID_XXXX.matcher(romanNumber).matches()
			|| INVALID_LL.matcher(romanNumber).matches()
			|| INVALID_CCCC.matcher(romanNumber).matches()
			|| INVALID_DD.matcher(romanNumber).matches())
			throw new NumberFormatException("Bad character found");
	}
}
