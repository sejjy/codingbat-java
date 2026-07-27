// Given a string, return the longest substring that appears at both the
// beginning and end of the string without overlapping. For example,
// sameEnds("abXab") is "ab".
//
// sameEnds("abXYab") → "ab"
// sameEnds("xx") → "x"
// sameEnds("xxx") → "x"

public class _07_sameEnds {

	public String sameEnds(String string) {
		String result = "";
		int length = string.length();

		for (int i = 1; i <= length / 2; i++) {
			String start = string.substring(0, i);

			if (start.equals(string.substring(length - i)))
				result = start;
		}

		return result;
	}
}
