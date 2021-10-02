package qdo.kata;

import java.util.Locale;
import java.util.regex.Pattern;

public class RomanNumberConvertor {

	public static int convert(String romanNumber) {
		String formattedRomanNumber = romanNumber.replaceAll("\s", "").toUpperCase(Locale.ENGLISH);
		Pattern pattern = Pattern.compile("^[IVXLCDM]+$");
		if(!pattern.matcher(formattedRomanNumber).matches())
			throw new NumberFormatException("Bad character found");
		else
			return 0;
	}
}
