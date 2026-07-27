// Given a string, return a string where every appearance of the lowercase word
// "is" has been replaced with "is not". The word "is" should not be immediately
// preceeded or followed by a letter -- so for example the "is" in "this" does
// not count. (Note: Character.isLetter(char) tests if a char is a letter.)
//
// notReplace("is test") → "is not test"
// notReplace("is-is") → "is not-is not"
// notReplace("This is right") → "This is not right"

public class _11_notReplace {

	public String notReplace(String str) {
		StringBuilder result = new StringBuilder();
		int length = str.length();

		for (int i = 0; i < length; i++) {
			if (str.startsWith("is", i)) {
				boolean hasNoPrevLetter = i == 0 ||
						!Character.isLetter(str.charAt(i - 1));
				boolean hasNoNextLetter = i + 2 == length ||
						!Character.isLetter(str.charAt(i + 2));

				if (hasNoPrevLetter && hasNoNextLetter) {
					result.append("is not");
					i++;
					continue;
				}
			}

			result.append(str.charAt(i));
		}

		return result.toString();
	}
}

// Just learned about StringBuilder
