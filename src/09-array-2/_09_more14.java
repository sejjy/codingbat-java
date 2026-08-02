// Given an array of ints, return true if the number of 1's is greater than the
// number of 4's
//
// more14([1, 4, 1]) → true
// more14([1, 4, 1, 4]) → false
// more14([1, 1]) → true

public class _09_more14 {

	public boolean more14(int[] nums) {
		int num1 = 0;
		int num4 = 0;

		for (int num : nums) {
			if (num == 1)
				num1++;
			if (num == 4)
				num4++;
		}

		return num1 > num4;
	}
}
