// Given a string, return true if the number of appearances of "is" anywhere in
// the string is equal to the number of appearances of "not" anywhere in the
// string (case sensitive).
//
// equalIsNot("This is not") → false
// equalIsNot("This is notnot") → true
// equalIsNot("noisxxnotyynotxisi") → true

public class _03_equalIsNot {

	public boolean equalIsNot(String str) {
		int isCount = 0;
		int notCount = 0;

		for (int i = 0; i < str.length(); i++) {
			if (str.startsWith("is", i))
				isCount++;
			if (str.startsWith("not", i))
				notCount++;
		}

		return isCount == notCount;
	}
}
