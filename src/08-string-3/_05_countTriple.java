// We'll say that a "triple" in a string is a char appearing three times in a
// row. Return the number of triples in the given string. The triples may
// overlap.
//
// countTriple("abcXXXabc") → 1
// countTriple("xxxabyyyycd") → 3
// countTriple("a") → 0

public class _05_countTriple {

	public int countTriple(String str) {
		int count = 0;
		char c;

		for (int i = 0; i <= str.length() - 3; i++) {
			c = str.charAt(i);

			if (c == str.charAt(i + 1) && c == str.charAt(i + 2))
				count++;
		}

		return count;
	}
}
