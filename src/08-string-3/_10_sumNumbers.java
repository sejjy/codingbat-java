// Given a string, return the sum of the numbers appearing in the string,
// ignoring all other characters. A number is a series of 1 or more digit chars
// in a row. (Note: Character.isDigit(char) tests if a char is one of the chars
// '0', '1', .. '9'. Integer.parseInt(string) converts a string to an int.)
//
// sumNumbers("abc123xyz") → 123
// sumNumbers("aa11b33") → 44
// sumNumbers("7 11") → 18

public class _10_sumNumbers {

	public int sumNumbers(String str) {
		int sum = 0;
		String number = "";

		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);

			if (Character.isDigit(c)) {
				number += c;
			} else {
				if (!number.isEmpty()) {
					sum += Integer.parseInt(number);
					number = "";
				}
			}
		}

		if (!number.isEmpty()) {
			sum += Integer.parseInt(number);
		}

		return sum;
	}
}
