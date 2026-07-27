// Given a string, return the length of the largest "block" in the string. A
// block is a run of adjacent chars that are the same.
//
// maxBlock("hoopla") → 2
// maxBlock("abbCCCddBBBxx") → 3
// maxBlock("") → 0

public class _09_maxBlock {

	public int maxBlock(String str) {
		int length = str.length();

		if (length < 2)
			return length;

		int max = 1;
		int temp = 1;

		for (int i = 0; i < length - 1; i++) {
			if (str.charAt(i) == str.charAt(i + 1))
				temp++;
			else
				temp = 1; // reset temp

			if (temp > max)
				max = temp;
		}

		return max;
	}
}
