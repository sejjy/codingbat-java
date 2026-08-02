// Return a version of the given array where each zero value in the array is
// replaced by the largest odd value to the right of the zero in the array. If
// there is no odd value to the right of the zero, leave the zero as a zero.
//
// zeroMax([0, 5, 0, 3]) → [5, 5, 3, 3]
// zeroMax([0, 4, 0, 3]) → [3, 4, 3, 3]
// zeroMax([0, 1, 0]) → [1, 1, 0]

public class _32_zeroMax {

	public int[] zeroMax(int[] nums) {
		int len = nums.length;
		int[] result = new int[len];
		int maxOdd = 0;

		for (int i = len - 1; i >= 0; i--) {
			int value = nums[i];

			if (value % 2 != 0)
				maxOdd = Math.max(maxOdd, value);

			result[i] = (value == 0) ? maxOdd : value;
		}

		return result;
	}
}
